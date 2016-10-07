package com.neogrid.simulator.util;


import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import com.neogrid.simulator.util.response.ResponseUtils;

public class ResponseUtilsTest {

	@Test
	public void substituiParametro() {
		String response = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>${request.parametro}</tag1>" +
				"</response>";
		
		String mensagemFinal = ResponseUtils.substituiParametro("parametro1", "valor", response);
		
		String responseEsperado = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>valor</tag1>" +
					"<tag1>valor</tag1>" +
					"<tag1>${request.parametro}</tag1>" +
				"</response>";
		
		assertEquals(responseEsperado, mensagemFinal);
	}
	
	@Test
	public void substituiParametroNoMatch() {
		String response = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>${request.parametro1}</tag1>" +
					"<tag1>${request.parametro1}</tag1>" +
					"<tag1>${request.parametro}</tag1>" +
				"</response>";
		
		String mensagemFinal = ResponseUtils.substituiParametro("parametro1", "valor", response);
		
		String responseEsperado = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>${request.parametro1}</tag1>" +
					"<tag1>${request.parametro1}</tag1>" +
					"<tag1>${request.parametro}</tag1>" +
				"</response>";
		
		assertEquals(responseEsperado, mensagemFinal);
	}
	
	@Test
	public void regexTest() {
		String response = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>${request.parametro}</tag1>" +
				"</response>";
		
		
		response = response.replaceAll("\\$\\{[A-Za-z0-9]+.[A-Za-z0-9]+}", "teste");
		
		String responseEsperado = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>teste</tag1>" +
					"<tag1>teste</tag1>" +
					"<tag1>teste</tag1>" +
				"</response>";
		
		assertEquals(responseEsperado, response);
	}
	
	@Test
	public void substituiParametroRequestTeste() {
		String response = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>${request.parametro}</tag1>" +
				"</response>";
		
		String mensagemFinal = ResponseUtils.substituiParametroRequest("parametro", "valor", response);
		
		String responseEsperado = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>valor</tag1>" +
				"</response>";
		
		assertEquals(responseEsperado, mensagemFinal);
	}
	
	@Test
	public void substituiParametroRequestTesteNoMatch() {
		String response = "<?xml version=\"1.0\"?>" +
				"<response>" +
					"<tag1>Fixa</tag1>" +
					"<tag1>${database.parametro1}</tag1>" +
					"<tag1>${database.parametro}</tag1>" +
					"<tag1>${database.parametro2}</tag1>" +
				"</response>";
		
		String mensagemFinal = ResponseUtils.substituiParametroRequest("parametro", "valor", response);
		
		String responseEsperado = "<?xml version=\"1.0\"?>" +
				"<response>" +
				"<tag1>Fixa</tag1>" +
				"<tag1>${database.parametro1}</tag1>" +
				"<tag1>${database.parametro}</tag1>" +
				"<tag1>${database.parametro2}</tag1>" +
			"</response>";
		
		assertEquals(responseEsperado, mensagemFinal);
	}

}
