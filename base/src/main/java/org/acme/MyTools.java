package org.acme;

import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;

public class MyTools {

    @Tool(description = "Get weather alerts for a US state.")
    String getAlerts(@ToolArg(description = "Two-letter US state code (e.g. CA, NY)") String state) {
        return "Vai cair um toró";
    }

    @Tool(description = "Get weather forecast for a location.")
    String getForecast(
            @ToolArg(description = "Latitude of the location") double latitude,
            @ToolArg(description = "Longitude of the location") double longitude) {
            return """
                        Temperature: 33°
                        Wind: 10 east
                        """;
    }

}
