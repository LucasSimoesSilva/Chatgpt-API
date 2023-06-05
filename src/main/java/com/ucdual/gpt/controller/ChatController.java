package com.ucdual.gpt.controller;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/chat")
public class ChatController {

    @PostMapping
    public ResponseEntity<List<CompletionChoice>> askToChat(@RequestBody String prompt) {
        OpenAiService service = new OpenAiService("");
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(prompt)
                .model("text-davinci-003")
                .maxTokens(100)
                .build();

        List<CompletionChoice> choices = service.createCompletion(completionRequest).getChoices();
        return ResponseEntity.status(HttpStatus.OK).body(choices);
    }
}
