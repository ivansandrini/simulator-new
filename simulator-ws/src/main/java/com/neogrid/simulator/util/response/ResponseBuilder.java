package com.neogrid.simulator.util.response;

import java.nio.charset.Charset;

import com.neogrid.simulator.model.ParametroResposta;
import com.neogrid.simulator.model.Resposta;

public class ResponseBuilder {

	private Resposta response;
	
	private String requestMessage;
	
	public ResponseBuilder(Resposta response, String requestMessage) {
		this.response = response;
		this.requestMessage = requestMessage;
	}

	public String build() {
		String udatedResponse = new String(response.getMensagem(), Charset.forName("UTF-8"));

		for(ParametroResposta parameter:response.getParametros()) {
			udatedResponse = ReplaceParameterFactory.replace(parameter, udatedResponse, requestMessage);
		}
		
		return udatedResponse;
	}
	
}
