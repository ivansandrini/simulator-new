
package com.neogrid.simulator.siltecnologia.saida.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.neogrid.simulator.siltecnologia.saida.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NfdSaidaResponse_QNAME = new QName("http://webservices.sil.com/", "nfdSaidaResponse");
    private final static QName _NfdSaida_QNAME = new QName("http://webservices.sil.com/", "nfdSaida");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.neogrid.simulator.siltecnologia.saida.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NfdSaidaResponse }
     * 
     */
    public NfdSaidaResponse createNfdSaidaResponse() {
        return new NfdSaidaResponse();
    }

    /**
     * Create an instance of {@link NfdSaida }
     * 
     */
    public NfdSaida createNfdSaida() {
        return new NfdSaida();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfdSaidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sil.com/", name = "nfdSaidaResponse")
    public JAXBElement<NfdSaidaResponse> createNfdSaidaResponse(NfdSaidaResponse value) {
        return new JAXBElement<NfdSaidaResponse>(_NfdSaidaResponse_QNAME, NfdSaidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfdSaida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sil.com/", name = "nfdSaida")
    public JAXBElement<NfdSaida> createNfdSaida(NfdSaida value) {
        return new JAXBElement<NfdSaida>(_NfdSaida_QNAME, NfdSaida.class, null, value);
    }

}
