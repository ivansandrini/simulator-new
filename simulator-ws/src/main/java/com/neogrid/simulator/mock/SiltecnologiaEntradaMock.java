package com.neogrid.simulator.mock;

import javax.jws.WebService;

import com.neogrid.simulator.enums.WebServiceLayout;
import com.neogrid.simulator.service.AbstractMockService;
import com.neogrid.simulator.siltecnologia.entrada.generated.WSEntrada;

@WebService(endpointInterface = "com.neogrid.simulator.siltecnologia.entrada.generated.WSEntrada")
public class SiltecnologiaEntradaMock extends AbstractMockService implements WSEntrada {

	@Override
	public WebServiceLayout getLayout() {
		return WebServiceLayout.SILTECNOLOGIA;
	}

	@Override
	public String consultarAtividades(String cpfUsuario, String hashSenha, String inscricaoMunicipal,
			int codigoMunicipio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nfdEntrada(String cpfUsuario, String hashSenha, int codigoMunicipio, String nfd) {
		return super.recepcionarLoteRps(nfd);
	}

	@Override
	public String nfdEntradaCancelar(String cpfUsuario, String hashSenha, String nfd) {
		// TODO Auto-generated method stub
		return null;
	}

}
