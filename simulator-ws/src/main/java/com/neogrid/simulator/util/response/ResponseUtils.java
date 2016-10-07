package com.neogrid.simulator.util.response;

public class ResponseUtils {

	public static String substituiParametro(final String parametro, final String value, final String mensagem) {
		String mensagemAlterada;

		mensagemAlterada = mensagem.replaceAll("\\$\\{database." + parametro + "}", value);

		return mensagemAlterada;
	}
	
	public static String substituiParametroRequest(final String parametro, final String value, final String mensagem) {
		String mensagemAlterada;

		mensagemAlterada = mensagem.replaceAll("\\$\\{request." + parametro + "}", value);

		return mensagemAlterada;
	}

}
