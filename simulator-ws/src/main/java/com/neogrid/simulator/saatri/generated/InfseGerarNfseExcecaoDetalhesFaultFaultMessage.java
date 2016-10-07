
package com.neogrid.simulator.saatri.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ExcecaoDetalhes", targetNamespace = "http://nfse.abrasf.org.br")
public class InfseGerarNfseExcecaoDetalhesFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ExcecaoDetalhes faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InfseGerarNfseExcecaoDetalhesFaultFaultMessage(String message, ExcecaoDetalhes faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InfseGerarNfseExcecaoDetalhesFaultFaultMessage(String message, ExcecaoDetalhes faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.neogrid.simulator.saatri.generated.ExcecaoDetalhes
     */
    public ExcecaoDetalhes getFaultInfo() {
        return faultInfo;
    }

}
