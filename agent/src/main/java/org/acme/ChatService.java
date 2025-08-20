package org.acme;

import io.quarkiverse.langchain4j.RegisterAiService;
import io.quarkiverse.langchain4j.mcp.runtime.McpToolBox;

@RegisterAiService
public interface ChatService {
    
    @McpToolBox
    public String chat(String message);

}
