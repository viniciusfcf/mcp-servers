package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.json.JsonObject;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class TelegramBot {

    @Inject
    Logger logger;

    @ConfigProperty(name = "telegram.token")
    private String token;

    @ConfigProperty(name = "telegram.chatId")
    private String chatId;

    private Client client;
    private WebTarget baseTarget;

    public Boolean sendMessage(String message) {
        Response response = baseTarget.path("sendMessage").queryParam("chat_id", chatId).queryParam("text", message)
                .request().get();
        JsonObject json = response.readEntity(JsonObject.class);
        return json.getBoolean("ok", false);
    }

    @PostConstruct
    void initClient() {
        client = ClientBuilder.newClient();
        baseTarget = client.target("https://api.telegram.org/bot{token}").resolveTemplate("token", this.token);
    }

    @PreDestroy
    private void closeClient() {
        client.close();
    }

}