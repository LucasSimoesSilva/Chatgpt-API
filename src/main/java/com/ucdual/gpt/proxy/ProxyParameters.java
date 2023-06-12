package com.ucdual.gpt.proxy;

import com.theokanning.openai.completion.CompletionRequest;
import com.ucdual.gpt.Parameters;

public class ProxyParameters implements Manager {

    CreateParameters createParameters;

    public ProxyParameters() {
        this.createParameters = new CreateParameters();
    }

    @Override
    public CompletionRequest setParameters(Parameters parameters) {
        return createParameters.setParameters(parameters);
    }
}
