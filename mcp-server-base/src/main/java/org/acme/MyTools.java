package org.acme;

import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;

public class MyTools {

    @Tool(description = "Recupera alertas climáticos de regiões Brasileiras")
    String getAlerts(@ToolArg(description = "Nome de alguma das 5 regiões do Brasil, ex: Nordeste") String state) {
        if(state.equalsIgnoreCase("Nordeste")) {
            return "Vai cair um toró";
        } else if(state.equalsIgnoreCase("Sudeste")) {
            return "Sem alertas";
        } else if(state.equalsIgnoreCase("Sul")) {
            return "Muito Frio";
        } else if(state.equalsIgnoreCase("Centro-Oeste")) {
            return "Tempo seco, muita chance de queimadas";
        } else if(state.equalsIgnoreCase("Norte")) {
            return "Muita chuva e mosquitos";
        }
        return "região desconhecida";
    }


}
