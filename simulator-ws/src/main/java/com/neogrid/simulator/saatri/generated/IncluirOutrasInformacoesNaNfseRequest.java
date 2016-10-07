
package com.neogrid.simulator.saatri.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscricaoMunicipalPrestador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numeroNfse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codigoVerificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="outrasInformacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inscricaoMunicipalPrestador",
    "numeroNfse",
    "codigoVerificacao",
    "outrasInformacoes"
})
@XmlRootElement(name = "IncluirOutrasInformacoesNaNfseRequest")
public class IncluirOutrasInformacoesNaNfseRequest {

    protected String inscricaoMunicipalPrestador;
    protected String numeroNfse;
    protected String codigoVerificacao;
    protected String outrasInformacoes;

    /**
     * Obtém o valor da propriedade inscricaoMunicipalPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoMunicipalPrestador() {
        return inscricaoMunicipalPrestador;
    }

    /**
     * Define o valor da propriedade inscricaoMunicipalPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoMunicipalPrestador(String value) {
        this.inscricaoMunicipalPrestador = value;
    }

    /**
     * Obtém o valor da propriedade numeroNfse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroNfse() {
        return numeroNfse;
    }

    /**
     * Define o valor da propriedade numeroNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroNfse(String value) {
        this.numeroNfse = value;
    }

    /**
     * Obtém o valor da propriedade codigoVerificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerificacao() {
        return codigoVerificacao;
    }

    /**
     * Define o valor da propriedade codigoVerificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerificacao(String value) {
        this.codigoVerificacao = value;
    }

    /**
     * Obtém o valor da propriedade outrasInformacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    /**
     * Define o valor da propriedade outrasInformacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutrasInformacoes(String value) {
        this.outrasInformacoes = value;
    }

}
