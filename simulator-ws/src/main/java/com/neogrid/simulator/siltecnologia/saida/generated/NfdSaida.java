
package com.neogrid.simulator.siltecnologia.saida.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de nfdSaida complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="nfdSaida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hashSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nfdSaida", propOrder = {
    "cpfUsuario",
    "hashSenha",
    "inscricaoMunicipal",
    "recibo"
})
public class NfdSaida {

    protected String cpfUsuario;
    protected String hashSenha;
    protected String inscricaoMunicipal;
    protected String recibo;

    /**
     * Obtém o valor da propriedade cpfUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfUsuario() {
        return cpfUsuario;
    }

    /**
     * Define o valor da propriedade cpfUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfUsuario(String value) {
        this.cpfUsuario = value;
    }

    /**
     * Obtém o valor da propriedade hashSenha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashSenha() {
        return hashSenha;
    }

    /**
     * Define o valor da propriedade hashSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashSenha(String value) {
        this.hashSenha = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoMunicipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    /**
     * Define o valor da propriedade inscricaoMunicipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoMunicipal(String value) {
        this.inscricaoMunicipal = value;
    }

    /**
     * Obtém o valor da propriedade recibo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecibo() {
        return recibo;
    }

    /**
     * Define o valor da propriedade recibo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecibo(String value) {
        this.recibo = value;
    }

}
