
package com.neogrid.simulator.siltecnologia.entrada.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSEntrada", targetNamespace = "http://webservices.sil.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSEntrada {


    /**
     * 
     * @param hashSenha
     * @param inscricaoMunicipal
     * @param cpfUsuario
     * @param codigoMunicipio
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarAtividades", targetNamespace = "http://webservices.sil.com/", className = "com.neogrid.simulator.siltecnologia.entrada.generated.ConsultarAtividades")
    @ResponseWrapper(localName = "consultarAtividadesResponse", targetNamespace = "http://webservices.sil.com/", className = "com.neogrid.simulator.siltecnologia.entrada.generated.ConsultarAtividadesResponse")
    @Action(input = "http://webservices.sil.com/WSEntrada/consultarAtividadesRequest", output = "http://webservices.sil.com/WSEntrada/consultarAtividadesResponse")
    public String consultarAtividades(
        @WebParam(name = "cpfUsuario", targetNamespace = "")
        String cpfUsuario,
        @WebParam(name = "hashSenha", targetNamespace = "")
        String hashSenha,
        @WebParam(name = "inscricaoMunicipal", targetNamespace = "")
        String inscricaoMunicipal,
        @WebParam(name = "codigoMunicipio", targetNamespace = "")
        int codigoMunicipio);

    /**
     * 
     * @param hashSenha
     * @param cpfUsuario
     * @param codigoMunicipio
     * @param nfd
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nfdEntrada", targetNamespace = "http://webservices.sil.com/", className = "com.neogrid.simulator.siltecnologia.entrada.generated.NfdEntrada")
    @ResponseWrapper(localName = "nfdEntradaResponse", targetNamespace = "http://webservices.sil.com/", className = "com.neogrid.simulator.siltecnologia.entrada.generated.NfdEntradaResponse")
    @Action(input = "http://webservices.sil.com/WSEntrada/nfdEntradaRequest", output = "http://webservices.sil.com/WSEntrada/nfdEntradaResponse")
    public String nfdEntrada(
        @WebParam(name = "cpfUsuario", targetNamespace = "")
        String cpfUsuario,
        @WebParam(name = "hashSenha", targetNamespace = "")
        String hashSenha,
        @WebParam(name = "codigoMunicipio", targetNamespace = "")
        int codigoMunicipio,
        @WebParam(name = "nfd", targetNamespace = "")
        String nfd);

    /**
     * 
     * @param hashSenha
     * @param cpfUsuario
     * @param nfd
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nfdEntradaCancelar", targetNamespace = "http://webservices.sil.com/", className = "com.neogrid.simulator.siltecnologia.entrada.generated.NfdEntradaCancelar")
    @ResponseWrapper(localName = "nfdEntradaCancelarResponse", targetNamespace = "http://webservices.sil.com/", className = "com.neogrid.simulator.siltecnologia.entrada.generated.NfdEntradaCancelarResponse")
    @Action(input = "http://webservices.sil.com/WSEntrada/nfdEntradaCancelarRequest", output = "http://webservices.sil.com/WSEntrada/nfdEntradaCancelarResponse")
    public String nfdEntradaCancelar(
        @WebParam(name = "cpfUsuario", targetNamespace = "")
        String cpfUsuario,
        @WebParam(name = "hashSenha", targetNamespace = "")
        String hashSenha,
        @WebParam(name = "nfd", targetNamespace = "")
        String nfd);

}
