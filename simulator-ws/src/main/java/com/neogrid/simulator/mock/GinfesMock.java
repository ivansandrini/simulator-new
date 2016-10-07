package com.neogrid.simulator.mock;

import javax.jws.WebService;

import com.neogrid.simulator.enums.WebServiceLayout;
import com.neogrid.simulator.ginfes.generated.ServiceGinfesImpl;
import com.neogrid.simulator.service.AbstractMockService;

@WebService(endpointInterface = "com.neogrid.simulator.ginfes.generated.ServiceGinfesImpl")
public class GinfesMock extends AbstractMockService implements ServiceGinfesImpl {
	
	public String cancelarNfse(String arg0) {
		return null;
	}

	public String cancelarNfseV3(String arg0, String arg1) {
		return null;
	}

	public String consultarLoteRps(String arg0) {
		return null;
	}

	public String consultarLoteRpsV3(String header, String requestMessage) {
		return super.consultarLoteRps(requestMessage);
	}

	public String consultarNfse(String arg0) {
		return null;
	}

	public String consultarNfsePorRps(String arg0) {
		return null;
	}

	public String consultarNfsePorRpsV3(String arg0, String arg1) {
		return null;
	}

	public String consultarNfseV3(String arg0, String arg1) {
		return null;
	}

	public String consultarSituacaoLoteRps(String arg0) {
		return null;
	}

	public String consultarSituacaoLoteRpsV3(String header, String requestMessage) {
		return super.consultarLoteRps(requestMessage);
	}

	public String recepcionarLoteRps(String arg0) {
		return null;
	}

	public String recepcionarLoteRpsV3(String header, String requestMessage) {
	    return super.recepcionarLoteRps(requestMessage);
	}

	@Override
	public WebServiceLayout getLayout() {
		return WebServiceLayout.GINFES;
	}
	
}
