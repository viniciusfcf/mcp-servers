#!/bin/bash

set -e

folders=("mcp-server-base" "mcp-server-telegram" "mcp-server-time" "agent")

for folder in "${folders[@]}"; do
  echo "Building and pushing container for $folder..."
  (cd "$folder" && ./mvnw clean package -DskipTests -Dquarkus.container-image.build=true -Dquarkus.container-image.push=true)
  echo "Deploying $folder to OpenShift..."
  (cd "$folder" && quarkus deploy openshift)
  echo "Done with $folder."
  echo "----------------------"
  sleep 1
  
  # Optionally, check for errors and exit if needed
  # if [ $? -ne 0 ]; then
  #   echo "Error in $folder. Exiting."
  #   exit 1
  # fi

done

echo "All projects built and deployed!"

# Exibe a rota criada pelo deployment do agent
echo "Obtendo rota do deployment 'agent' no OpenShift..."
oc get route -n mcp | grep agent || echo "Nenhuma rota encontrada para 'agent' no namespace 'mcp'."
