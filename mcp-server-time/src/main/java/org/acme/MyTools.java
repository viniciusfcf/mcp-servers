package org.acme;

import java.time.LocalDateTime;

import io.quarkiverse.mcp.server.Tool;

public class MyTools {

    @Tool(description = "Get current time.")
    String getCurrentTime() {
        return LocalDateTime.now().toString();
    }


}
