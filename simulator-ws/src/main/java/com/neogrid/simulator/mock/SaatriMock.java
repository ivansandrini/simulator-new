package com.neogrid.simulator.mock;

import javax.jws.WebService;

import com.neogrid.simulator.enums.WebServiceLayout;
import com.neogrid.simulator.saatri.generated.CancelarNfseRequest;
import com.neogrid.simulator.saatri.generated.CancelarNfseResponse;
import com.neogrid.simulator.saatri.generated.ConsultarLoteRpsRequest;
import com.neogrid.simulator.saatri.generated.ConsultarLoteRpsResponse;
import com.neogrid.simulator.saatri.generated.ConsultarNfsePorFaixaRequest;
import com.neogrid.simulator.saatri.generated.ConsultarNfsePorFaixaResponse;
import com.neogrid.simulator.saatri.generated.ConsultarNfsePorRpsRequest;
import com.neogrid.simulator.saatri.generated.ConsultarNfsePorRpsResponse;
import com.neogrid.simulator.saatri.generated.ConsultarNfseServicoPrestadoRequest;
import com.neogrid.simulator.saatri.generated.ConsultarNfseServicoPrestadoResponse;
import com.neogrid.simulator.saatri.generated.ConsultarNfseServicoTomadoRequest;
import com.neogrid.simulator.saatri.generated.ConsultarNfseServicoTomadoResponse;
import com.neogrid.simulator.saatri.generated.GerarNfseRequest;
import com.neogrid.simulator.saatri.generated.GerarNfseResponse;
import com.neogrid.simulator.saatri.generated.IncluirOutrasInformacoesNaNfseRequest;
import com.neogrid.simulator.saatri.generated.IncluirOutrasInformacoesNaNfseResponse;
import com.neogrid.simulator.saatri.generated.Infse;
import com.neogrid.simulator.saatri.generated.InfseCancelarNfseExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseConsultarLoteRpsExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseConsultarNfsePorFaixaExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseConsultarNfsePorRpsExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseConsultarNfseServicoPrestadoExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseConsultarNfseServicoTomadoExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseGerarNfseExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseIncluirOutrasInformacoesNaNfseExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseRecepcionarLoteRpsExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseRecepcionarLoteRpsSincronoExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.InfseSubstituirNfseExcecaoDetalhesFaultFaultMessage;
import com.neogrid.simulator.saatri.generated.RecepcionarLoteRpsRequest;
import com.neogrid.simulator.saatri.generated.RecepcionarLoteRpsResponse;
import com.neogrid.simulator.saatri.generated.RecepcionarLoteRpsSincronoRequest;
import com.neogrid.simulator.saatri.generated.RecepcionarLoteRpsSincronoResponse;
import com.neogrid.simulator.saatri.generated.SubstituirNfseRequest;
import com.neogrid.simulator.saatri.generated.SubstituirNfseResponse;
import com.neogrid.simulator.service.AbstractMockService;

@WebService(endpointInterface = "com.neogrid.simulator.saatri.generated.Infse")
public class SaatriMock extends AbstractMockService implements Infse {

	@Override
	public WebServiceLayout getLayout() {
		return WebServiceLayout.SAATRI;
	}

	@Override
	public RecepcionarLoteRpsResponse recepcionarLoteRps(RecepcionarLoteRpsRequest parameters)
			throws InfseRecepcionarLoteRpsExcecaoDetalhesFaultFaultMessage {
		
		RecepcionarLoteRpsResponse response = new RecepcionarLoteRpsResponse();
		response.setOutputXML(super.recepcionarLoteRps(parameters.getNfseDadosMsg()));
		
		return response;
	}

	@Override
	public RecepcionarLoteRpsSincronoResponse recepcionarLoteRpsSincrono(RecepcionarLoteRpsSincronoRequest parameters)
			throws InfseRecepcionarLoteRpsSincronoExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GerarNfseResponse gerarNfse(GerarNfseRequest parameters)
			throws InfseGerarNfseExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelarNfseResponse cancelarNfse(CancelarNfseRequest parameters)
			throws InfseCancelarNfseExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubstituirNfseResponse substituirNfse(SubstituirNfseRequest parameters)
			throws InfseSubstituirNfseExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultarLoteRpsResponse consultarLoteRps(ConsultarLoteRpsRequest parameters)
			throws InfseConsultarLoteRpsExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultarNfsePorRpsResponse consultarNfsePorRps(ConsultarNfsePorRpsRequest parameters)
			throws InfseConsultarNfsePorRpsExcecaoDetalhesFaultFaultMessage {
		
		ConsultarNfsePorRpsResponse response = new ConsultarNfsePorRpsResponse();
		response.setOutputXML(super.consultarNfsePorRps(parameters.getNfseDadosMsg()));
		
		return response;
	}

	@Override
	public ConsultarNfseServicoPrestadoResponse consultarNfseServicoPrestado(
			ConsultarNfseServicoPrestadoRequest parameters)
			throws InfseConsultarNfseServicoPrestadoExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultarNfseServicoTomadoResponse consultarNfseServicoTomado(ConsultarNfseServicoTomadoRequest parameters)
			throws InfseConsultarNfseServicoTomadoExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultarNfsePorFaixaResponse consultarNfsePorFaixa(ConsultarNfsePorFaixaRequest parameters)
			throws InfseConsultarNfsePorFaixaExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IncluirOutrasInformacoesNaNfseResponse incluirOutrasInformacoesNaNfse(
			IncluirOutrasInformacoesNaNfseRequest parameters)
			throws InfseIncluirOutrasInformacoesNaNfseExcecaoDetalhesFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

}
