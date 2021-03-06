
package com.neogrid.simulator.siltecnologia.saida.generated;

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
@WebService(name = "WSSaida", targetNamespace = "http://webservices.sil.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSSaida {


    /**
     * 
     * @param recibo
     * @param hashSenha
     * @param inscricaoMunicipal
     * @param cpfUsuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nfdSaida", targetNamespace = "http://webservices.sil.com/", className = "com.neogrid.simulator.siltecnologia.saida.generated.NfdSaida")
    @ResponseWrapper(localName = "nfdSaidaResponse", targetNamespace = "http://webservices.sil.com/", className = "com.neogrid.simulator.siltecnologia.saida.generated.NfdSaidaResponse")
    @Action(input = "http://webservices.sil.com/WSSaida/nfdSaidaRequest", output = "http://webservices.sil.com/WSSaida/nfdSaidaResponse")
    public String nfdSaida(
        @WebParam(name = "cpfUsuario", targetNamespace = "")
        String cpfUsuario,
        @WebParam(name = "hashSenha", targetNamespace = "")
        String hashSenha,
        @WebParam(name = "inscricaoMunicipal", targetNamespace = "")
        String inscricaoMunicipal,
        @WebParam(name = "recibo", targetNamespace = "")
        String recibo);

}
