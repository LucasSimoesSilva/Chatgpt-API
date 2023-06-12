package com.ucdual.gpt.proxy;

import com.theokanning.openai.completion.CompletionRequest;
import com.ucdual.gpt.Parameters;

public class CreateParameters implements Manager{
    @Override
    public CompletionRequest setParameters(Parameters parameters) {

        return CompletionRequest.builder()
                .model(parameters.getModel())
                .prompt(parameters.getPrompt())
                .suffix(parameters.getSuffix())
                .maxTokens(parameters.getMaxTokens())
                .temperature(parameters.getTemperature())
                .topP(parameters.getTopP())
                .n(parameters.getN())
                .stream(parameters.isStream())
                .logprobs(parameters.getLogprobs())
                .echo(parameters.isEcho())
                .stop(parameters.getStop())
                .presencePenalty(parameters.getPresencePenalty())
                .frequencyPenalty(parameters.getFrequencyPenalty())
                .bestOf(parameters.getBestOf())
                .logitBias(parameters.getLogitBias())
                .user(parameters.getUser())
                .build();
    }
}
