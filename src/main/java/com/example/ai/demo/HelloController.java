package com.example.ai.demo;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private final ChatClient chatClient;

    public HelloController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    @GetMapping
    public String prompt(@RequestParam String message) {

        return chatClient.prompt(message).call().content();
    }

    //Api with Prompt Template
    @GetMapping("/celebrate")
    public String getCelebrate(@RequestParam String name) {

        String message = "List the details of the Famous pernality {name} along with carrier achievments. Show the details in the readable formate";

        PromptTemplate promptTemplate = new PromptTemplate(message);

        Map map = new HashMap<String, String>();
        map.put("name", name);

        Prompt prompt = promptTemplate.create(map);

        return chatClient.prompt(prompt).call().content();
    }
}
