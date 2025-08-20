package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
public class ChatResource {

    @Inject
    ChatService chatService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public ChatMessage chat(ChatMessage userMessage) {
        if(userMessage.getWithTools() != null && userMessage.getWithTools()) {
            return ChatMessage.of(chatService.chat(userMessage.getMessage()));
        }
        return ChatMessage.of(chatService.chatWithoutTools(userMessage.getMessage()));
    }
}
