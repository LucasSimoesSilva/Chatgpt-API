package com.ucdual.gpt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parameters {
    private String model;
    private String prompt;
    private String suffix;
    private Integer maxTokens;
    private double temperature;
    private double topP;
    private Integer n;
    private boolean stream;
    private Integer logprobs;
    private boolean echo;
    private List<String> stop;
    private double presencePenalty;
    private double frequencyPenalty;
    private Integer bestOf;
    private Map<String, Integer> logitBias;
    private String user;

}
