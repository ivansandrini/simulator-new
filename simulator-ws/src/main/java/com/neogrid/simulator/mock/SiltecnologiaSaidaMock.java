package com.neogrid.simulator.mock;

import javax.jws.WebService;

import com.neogrid.simulator.enums.WebServiceLayout;
import com.neogrid.simulator.service.AbstractMockService;
import com.neogrid.simulator.siltecnologia.saida.generated.WSSaida;

@WebService(endpointInterface = "com.neogrid.simulator.siltecnologia.saida.generated.WSSaida")
public class SiltecnologiaSaidaMock extends AbstractMockService implements WSSaida {

	@Override
	public WebServiceLayout getLayout() {
		return WebServiceLayout.SILTECNOLOGIA;
	}

	@Override
	public String nfdSaida(String cpfUsuario, String hashSenha, String inscricaoMunicipal, String recibo) {
		return super.consultarLoteRps(recibo);
	}

}
