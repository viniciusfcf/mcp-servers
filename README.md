# MCP Servers

Este repositório contém projetos para facilitar a criação de agentes e servidores MCP (Model Context Protocol).

## Projetos

### agent
Projeto base para criação de agentes. Ele é genérico o suficiente para permitir a configuração de uma chave do ChatGPT e diferentes MCP servers. Ideal para quem deseja criar agentes customizados que interagem com múltiplos servidores MCP e serviços de IA.

**Principais funcionalidades:**
- Configuração flexível de chave do ChatGPT
- Suporte a múltiplos MCP servers
- Estrutura modular para extensão de agentes

### mcp-server-base
Projeto base para criar um MCP server. Fornece a estrutura essencial para implementar servidores MCP, facilitando a integração com diferentes agentes e serviços.

**Principais funcionalidades:**
- Estrutura pronta para servidores MCP
- Facilidade de integração com agentes
- Código limpo e extensível

---


## Como acessar a aplicação agent

Basta abrir o arquivo `index.html` do projeto agent em seu navegador. A interface web permite interagir com o agente e realizar perguntas diretamente.

## Como configurar um novo MCP server

1. Crie um novo projeto baseado no template `mcp-server-base`.
2. Implemente as ferramentas (Tools) desejadas, seguindo o padrão MCP.
3. Configure o agente para reconhecer o novo MCP server, adicionando sua URL ou endpoint nas configurações do agent.
4. Reinicie o agente para aplicar as novas configurações.

## Exemplo de pergunta e resposta

**Pergunta:** Quais são os alertas para a cidade de Maceió? Envie a resposta pelo telegram com a data atual.

### Sem Tools
O agente responde apenas com informações textuais, sem executar ações externas:

> "Desculpe, não tenho informações de alertas ou da hora atual."

### Com Tools
O agente utiliza uma ferramenta para enviar a resposta via Telegram:

> "Os alertas para a cidade de Maceió são: [lista de alertas]. Data: 26/08/2025."
> (Mensagem enviada automaticamente para o Telegram cadastrado.)

---

Consulte a documentação de cada projeto para instruções de uso e exemplos de configuração.