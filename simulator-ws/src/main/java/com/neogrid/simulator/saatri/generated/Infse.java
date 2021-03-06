
package com.neogrid.simulator.saatri.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Infse", targetNamespace = "http://nfse.abrasf.org.br")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Infse {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.RecepcionarLoteRpsResponse
     * @throws InfseRecepcionarLoteRpsExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "RecepcionarLoteRps", action = "http://nfse.abrasf.org.br/Infse/RecepcionarLoteRps")
    @WebResult(name = "RecepcionarLoteRpsResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public RecepcionarLoteRpsResponse recepcionarLoteRps(
        @WebParam(name = "RecepcionarLoteRpsRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        RecepcionarLoteRpsRequest parameters)
        throws InfseRecepcionarLoteRpsExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.RecepcionarLoteRpsSincronoResponse
     * @throws InfseRecepcionarLoteRpsSincronoExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "RecepcionarLoteRpsSincrono", action = "http://nfse.abrasf.org.br/Infse/RecepcionarLoteRpsSincrono")
    @WebResult(name = "RecepcionarLoteRpsSincronoResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public RecepcionarLoteRpsSincronoResponse recepcionarLoteRpsSincrono(
        @WebParam(name = "RecepcionarLoteRpsSincronoRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        RecepcionarLoteRpsSincronoRequest parameters)
        throws InfseRecepcionarLoteRpsSincronoExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.GerarNfseResponse
     * @throws InfseGerarNfseExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "GerarNfse", action = "http://nfse.abrasf.org.br/Infse/GerarNfse")
    @WebResult(name = "GerarNfseResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public GerarNfseResponse gerarNfse(
        @WebParam(name = "GerarNfseRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        GerarNfseRequest parameters)
        throws InfseGerarNfseExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.CancelarNfseResponse
     * @throws InfseCancelarNfseExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "CancelarNfse", action = "http://nfse.abrasf.org.br/Infse/CancelarNfse")
    @WebResult(name = "CancelarNfseResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public CancelarNfseResponse cancelarNfse(
        @WebParam(name = "CancelarNfseRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        CancelarNfseRequest parameters)
        throws InfseCancelarNfseExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.SubstituirNfseResponse
     * @throws InfseSubstituirNfseExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "SubstituirNfse", action = "http://nfse.abrasf.org.br/Infse/SubstituirNfse")
    @WebResult(name = "SubstituirNfseResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public SubstituirNfseResponse substituirNfse(
        @WebParam(name = "SubstituirNfseRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        SubstituirNfseRequest parameters)
        throws InfseSubstituirNfseExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.ConsultarLoteRpsResponse
     * @throws InfseConsultarLoteRpsExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "ConsultarLoteRps", action = "http://nfse.abrasf.org.br/Infse/ConsultarLoteRps")
    @WebResult(name = "ConsultarLoteRpsResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public ConsultarLoteRpsResponse consultarLoteRps(
        @WebParam(name = "ConsultarLoteRpsRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        ConsultarLoteRpsRequest parameters)
        throws InfseConsultarLoteRpsExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.ConsultarNfsePorRpsResponse
     * @throws InfseConsultarNfsePorRpsExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "ConsultarNfsePorRps", action = "http://nfse.abrasf.org.br/Infse/ConsultarNfsePorRps")
    @WebResult(name = "ConsultarNfsePorRpsResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public ConsultarNfsePorRpsResponse consultarNfsePorRps(
        @WebParam(name = "ConsultarNfsePorRpsRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        ConsultarNfsePorRpsRequest parameters)
        throws InfseConsultarNfsePorRpsExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.ConsultarNfseServicoPrestadoResponse
     * @throws InfseConsultarNfseServicoPrestadoExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "ConsultarNfseServicoPrestado", action = "http://nfse.abrasf.org.br/Infse/ConsultarNfseServicoPrestado")
    @WebResult(name = "ConsultarNfseServicoPrestadoResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public ConsultarNfseServicoPrestadoResponse consultarNfseServicoPrestado(
        @WebParam(name = "ConsultarNfseServicoPrestadoRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        ConsultarNfseServicoPrestadoRequest parameters)
        throws InfseConsultarNfseServicoPrestadoExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.ConsultarNfseServicoTomadoResponse
     * @throws InfseConsultarNfseServicoTomadoExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "ConsultarNfseServicoTomado", action = "http://nfse.abrasf.org.br/Infse/ConsultarNfseServicoTomado")
    @WebResult(name = "ConsultarNfseServicoTomadoResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public ConsultarNfseServicoTomadoResponse consultarNfseServicoTomado(
        @WebParam(name = "ConsultarNfseServicoTomadoRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        ConsultarNfseServicoTomadoRequest parameters)
        throws InfseConsultarNfseServicoTomadoExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.ConsultarNfsePorFaixaResponse
     * @throws InfseConsultarNfsePorFaixaExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "ConsultarNfsePorFaixa", action = "http://nfse.abrasf.org.br/Infse/ConsultarNfsePorFaixa")
    @WebResult(name = "ConsultarNfsePorFaixaResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public ConsultarNfsePorFaixaResponse consultarNfsePorFaixa(
        @WebParam(name = "ConsultarNfsePorFaixaRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        ConsultarNfsePorFaixaRequest parameters)
        throws InfseConsultarNfsePorFaixaExcecaoDetalhesFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.neogrid.simulator.saatri.generated.IncluirOutrasInformacoesNaNfseResponse
     * @throws InfseIncluirOutrasInformacoesNaNfseExcecaoDetalhesFaultFaultMessage
     */
    @WebMethod(operationName = "IncluirOutrasInformacoesNaNfse", action = "http://nfse.abrasf.org.br/Infse/IncluirOutrasInformacoesNaNfse")
    @WebResult(name = "IncluirOutrasInformacoesNaNfseResponse", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
    public IncluirOutrasInformacoesNaNfseResponse incluirOutrasInformacoesNaNfse(
        @WebParam(name = "IncluirOutrasInformacoesNaNfseRequest", targetNamespace = "http://nfse.abrasf.org.br", partName = "parameters")
        IncluirOutrasInformacoesNaNfseRequest parameters)
        throws InfseIncluirOutrasInformacoesNaNfseExcecaoDetalhesFaultFaultMessage
    ;

}
