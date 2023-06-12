package com.ucdual.gpt.connection;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.ucdual.gpt.Parameters;
import com.ucdual.gpt.proxy.ProxyParameters;

import java.util.ArrayList;
import java.util.List;

public class ConnectionApi{

    ProxyParameters proxyParameters;

    public ConnectionApi() {
        this.proxyParameters = new ProxyParameters();
    }

    public List<CompletionChoice> connectApi(String prompt){
        String token ="";
        OpenAiService service = new OpenAiService(token);

        Parameters parameters = new Parameters(
                "text-davinci-003",prompt,null,100,0,1,1,
                false,null,false,new ArrayList<>(),0,0,1,
                null,"Marcelo H. S. Ventura");

        CompletionRequest completionRequest = proxyParameters.setParameters(parameters);

        return service.createCompletion(completionRequest).getChoices();
    }

}
