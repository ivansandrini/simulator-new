package com.neogrid.simulator.util.response;

import java.security.InvalidParameterException;

import com.neogrid.simulator.model.ParametroResposta;

public class ReplaceParameterFactory {

	public static String replace(ParametroResposta parameter, String message, String requestMessage) {
		ReplaceParameter replaceParameter = null;
		
		switch (parameter.getParameterType()) {
		case DATABASE:
			replaceParameter = new ReplaceParameterDatabase(parameter.getChave(), parameter.getValor(), new String(parameter.getResposta().getMensagem()));
			break;
		case REQUEST:
			replaceParameter = new ReplaceParameterRequest(parameter.getChave(), requestMessage, message);
			break;
		default:
			throw new InvalidParameterException("Tipo de parametro desconhecido.");
		}
		return replaceParameter.replace();
	}
}
