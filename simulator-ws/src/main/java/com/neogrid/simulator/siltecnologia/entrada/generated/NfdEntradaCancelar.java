
package com.neogrid.simulator.siltecnologia.entrada.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de nfdEntradaCancelar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="nfdEntradaCancelar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hashSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nfd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nfdEntradaCancelar", propOrder = {
    "cpfUsuario",
    "hashSenha",
    "nfd"
})
public class NfdEntradaCancelar {

    protected String cpfUsuario;
    protected String hashSenha;
    protected String nfd;

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
     * Obtém o valor da propriedade nfd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfd() {
        return nfd;
    }

    /**
     * Define o valor da propriedade nfd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfd(String value) {
        this.nfd = value;
    }

}
