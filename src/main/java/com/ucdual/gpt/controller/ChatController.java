package com.ucdual.gpt.controller;

import com.theokanning.openai.completion.CompletionChoice;
import com.ucdual.gpt.connection.ConnectionApi;
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

    ConnectionApi connectionApi = new ConnectionApi();

    @PostMapping
    public ResponseEntity<List<CompletionChoice>> askToChat(@RequestBody String prompt) {
        List<CompletionChoice> completionChoices = connectionApi.connectApi(prompt);

        return ResponseEntity.status(HttpStatus.OK).body(completionChoices);
    }
}
