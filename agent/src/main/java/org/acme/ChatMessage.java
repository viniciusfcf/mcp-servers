package org.acme;

public class ChatMessage {
    
    private String message;

    public static ChatMessage of(String message) {
        return new ChatMessage(message);
    }

    public ChatMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
