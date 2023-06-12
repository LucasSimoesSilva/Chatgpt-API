package com.ucdual.gpt.proxy;

import com.theokanning.openai.completion.CompletionRequest;
import com.ucdual.gpt.Parameters;

public interface Manager {
    CompletionRequest setParameters(Parameters parameters);
}
