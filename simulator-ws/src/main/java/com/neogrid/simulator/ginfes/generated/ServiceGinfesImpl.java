
package com.neogrid.simulator.ginfes.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceGinfesImpl", targetNamespace = "http://homologacao.ginfes.com.br")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ServiceGinfesImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CancelarNfse")
    @WebResult(partName = "return")
    public String cancelarNfse(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CancelarNfseV3")
    @WebResult(partName = "return")
    public String cancelarNfseV3(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarLoteRps")
    @WebResult(partName = "return")
    public String consultarLoteRps(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarLoteRpsV3")
    @WebResult(partName = "return")
    public String consultarLoteRpsV3(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarNfse")
    @WebResult(partName = "return")
    public String consultarNfse(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarNfsePorRps")
    @WebResult(partName = "return")
    public String consultarNfsePorRps(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarNfsePorRpsV3")
    @WebResult(partName = "return")
    public String consultarNfsePorRpsV3(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarNfseV3")
    @WebResult(partName = "return")
    public String consultarNfseV3(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarSituacaoLoteRps")
    @WebResult(partName = "return")
    public String consultarSituacaoLoteRps(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultarSituacaoLoteRpsV3")
    @WebResult(partName = "return")
    public String consultarSituacaoLoteRpsV3(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RecepcionarLoteRps")
    @WebResult(partName = "return")
    public String recepcionarLoteRps(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RecepcionarLoteRpsV3")
    @WebResult(partName = "return")
    public String recepcionarLoteRpsV3(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

}