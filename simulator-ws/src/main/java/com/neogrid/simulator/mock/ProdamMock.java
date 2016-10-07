package com.neogrid.simulator.mock;

import javax.jws.WebService;

import com.neogrid.simulator.enums.WebServiceLayout;
import com.neogrid.simulator.prodam.generated.CancelamentoNFeRequest;
import com.neogrid.simulator.prodam.generated.CancelamentoNFeResponse;
import com.neogrid.simulator.prodam.generated.ConsultaCNPJRequest;
import com.neogrid.simulator.prodam.generated.ConsultaCNPJResponse;
import com.neogrid.simulator.prodam.generated.ConsultaInformacoesLoteRequest;
import com.neogrid.simulator.prodam.generated.ConsultaInformacoesLoteResponse;
import com.neogrid.simulator.prodam.generated.ConsultaLoteRequest;
import com.neogrid.simulator.prodam.generated.ConsultaLoteResponse;
import com.neogrid.simulator.prodam.generated.ConsultaNFeEmitidasRequest;
import com.neogrid.simulator.prodam.generated.ConsultaNFeEmitidasResponse;
import com.neogrid.simulator.prodam.generated.ConsultaNFeRecebidasRequest;
import com.neogrid.simulator.prodam.generated.ConsultaNFeRecebidasResponse;
import com.neogrid.simulator.prodam.generated.ConsultaNFeRequest;
import com.neogrid.simulator.prodam.generated.ConsultaNFeResponse;
import com.neogrid.simulator.prodam.generated.EnvioLoteRPSRequest;
import com.neogrid.simulator.prodam.generated.EnvioLoteRPSResponse;
import com.neogrid.simulator.prodam.generated.EnvioRPSRequest;
import com.neogrid.simulator.prodam.generated.EnvioRPSResponse;
import com.neogrid.simulator.prodam.generated.LoteNFeSoap;
import com.neogrid.simulator.prodam.generated.TesteEnvioLoteRPSRequest;
import com.neogrid.simulator.prodam.generated.TesteEnvioLoteRPSResponse;
import com.neogrid.simulator.service.AbstractMockService;

@WebService(name = "LoteNFeSoap", targetNamespace = "http://www.prefeitura.sp.gov.br/nfe")
public class ProdamMock extends AbstractMockService implements LoteNFeSoap {

	@Override
	public EnvioRPSResponse envioRPS(EnvioRPSRequest parameters) {
		return null;
	}

	@Override
	public EnvioLoteRPSResponse envioLoteRPS(EnvioLoteRPSRequest parameters) {
		EnvioLoteRPSResponse envioLoteRPSResponse = new EnvioLoteRPSResponse();
		envioLoteRPSResponse.setRetornoXML(super.recepcionarLoteRps(parameters.getMensagemXML()));
		
		return envioLoteRPSResponse;
	}

	@Override
	public TesteEnvioLoteRPSResponse testeEnvioLoteRPS(TesteEnvioLoteRPSRequest parameters) {
		return null;
	}

	@Override
	public CancelamentoNFeResponse cancelamentoNFe(CancelamentoNFeRequest parameters) {
		return null;
	}

	@Override
	public ConsultaNFeResponse consultaNFe(ConsultaNFeRequest parameters) {
		return null;
	}

	@Override
	public ConsultaNFeRecebidasResponse consultaNFeRecebidas(ConsultaNFeRecebidasRequest parameters) {
		return null;
	}

	@Override
	public ConsultaNFeEmitidasResponse consultaNFeEmitidas(ConsultaNFeEmitidasRequest parameters) {
		return null;
	}

	@Override
	public ConsultaLoteResponse consultaLote(ConsultaLoteRequest parameters) {
		ConsultaLoteResponse consultaLoteResponse = new ConsultaLoteResponse();
		consultaLoteResponse.setRetornoXML(super.consultarLoteRps(parameters.getMensagemXML()));
		
		return consultaLoteResponse;
	}

	@Override
	public ConsultaInformacoesLoteResponse consultaInformacoesLote(ConsultaInformacoesLoteRequest parameters) {
		return null;
	}

	@Override
	public ConsultaCNPJResponse consultaCNPJ(ConsultaCNPJRequest parameters) {
		return null;
	}

	@Override
	public WebServiceLayout getLayout() {
		return WebServiceLayout.PRODAM;
	}

}