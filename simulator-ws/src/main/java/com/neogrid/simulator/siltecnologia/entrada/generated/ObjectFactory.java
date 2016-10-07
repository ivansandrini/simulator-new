
package com.neogrid.simulator.siltecnologia.entrada.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.neogrid.simulator.siltecnologia.entrada.generated package. 
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

    private final static QName _NfdEntrada_QNAME = new QName("http://webservices.sil.com/", "nfdEntrada");
    private final static QName _NfdEntradaCancelar_QNAME = new QName("http://webservices.sil.com/", "nfdEntradaCancelar");
    private final static QName _ConsultarAtividades_QNAME = new QName("http://webservices.sil.com/", "consultarAtividades");
    private final static QName _ConsultarAtividadesResponse_QNAME = new QName("http://webservices.sil.com/", "consultarAtividadesResponse");
    private final static QName _NfdEntradaCancelarResponse_QNAME = new QName("http://webservices.sil.com/", "nfdEntradaCancelarResponse");
    private final static QName _NfdEntradaResponse_QNAME = new QName("http://webservices.sil.com/", "nfdEntradaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.neogrid.simulator.siltecnologia.entrada.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarAtividadesResponse }
     * 
     */
    public ConsultarAtividadesResponse createConsultarAtividadesResponse() {
        return new ConsultarAtividadesResponse();
    }

    /**
     * Create an instance of {@link NfdEntradaCancelarResponse }
     * 
     */
    public NfdEntradaCancelarResponse createNfdEntradaCancelarResponse() {
        return new NfdEntradaCancelarResponse();
    }

    /**
     * Create an instance of {@link NfdEntradaResponse }
     * 
     */
    public NfdEntradaResponse createNfdEntradaResponse() {
        return new NfdEntradaResponse();
    }

    /**
     * Create an instance of {@link NfdEntrada }
     * 
     */
    public NfdEntrada createNfdEntrada() {
        return new NfdEntrada();
    }

    /**
     * Create an instance of {@link NfdEntradaCancelar }
     * 
     */
    public NfdEntradaCancelar createNfdEntradaCancelar() {
        return new NfdEntradaCancelar();
    }

    /**
     * Create an instance of {@link ConsultarAtividades }
     * 
     */
    public ConsultarAtividades createConsultarAtividades() {
        return new ConsultarAtividades();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfdEntrada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sil.com/", name = "nfdEntrada")
    public JAXBElement<NfdEntrada> createNfdEntrada(NfdEntrada value) {
        return new JAXBElement<NfdEntrada>(_NfdEntrada_QNAME, NfdEntrada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfdEntradaCancelar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sil.com/", name = "nfdEntradaCancelar")
    public JAXBElement<NfdEntradaCancelar> createNfdEntradaCancelar(NfdEntradaCancelar value) {
        return new JAXBElement<NfdEntradaCancelar>(_NfdEntradaCancelar_QNAME, NfdEntradaCancelar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarAtividades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sil.com/", name = "consultarAtividades")
    public JAXBElement<ConsultarAtividades> createConsultarAtividades(ConsultarAtividades value) {
        return new JAXBElement<ConsultarAtividades>(_ConsultarAtividades_QNAME, ConsultarAtividades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarAtividadesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sil.com/", name = "consultarAtividadesResponse")
    public JAXBElement<ConsultarAtividadesResponse> createConsultarAtividadesResponse(ConsultarAtividadesResponse value) {
        return new JAXBElement<ConsultarAtividadesResponse>(_ConsultarAtividadesResponse_QNAME, ConsultarAtividadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfdEntradaCancelarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sil.com/", name = "nfdEntradaCancelarResponse")
    public JAXBElement<NfdEntradaCancelarResponse> createNfdEntradaCancelarResponse(NfdEntradaCancelarResponse value) {
        return new JAXBElement<NfdEntradaCancelarResponse>(_NfdEntradaCancelarResponse_QNAME, NfdEntradaCancelarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfdEntradaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.sil.com/", name = "nfdEntradaResponse")
    public JAXBElement<NfdEntradaResponse> createNfdEntradaResponse(NfdEntradaResponse value) {
        return new JAXBElement<NfdEntradaResponse>(_NfdEntradaResponse_QNAME, NfdEntradaResponse.class, null, value);
    }

}
