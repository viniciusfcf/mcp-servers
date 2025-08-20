package org.acme;

import io.quarkiverse.mcp.server.Tool;
import jakarta.inject.Inject;

public class MyTools {

    @Inject
    TelegramBot telegramBot;

    @Tool(description = "Send a message to Telegram. Return true if send successfully")
    public String sendMessage(String message) {
        return telegramBot.sendMessage(message).toString();
    }


}
