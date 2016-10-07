
package com.neogrid.simulator.saatri.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExcecaoDetalhes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExcecaoDetalhes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Componente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescricaoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcecaoDetalhes", propOrder = {
    "componente",
    "classe",
    "metodo",
    "codigoErro",
    "descricaoErro",
    "motivoErro",
    "mensagem"
})
public class ExcecaoDetalhes {

    @XmlElement(name = "Componente", namespace = "http://nfse.abrasf.org.br")
    protected String componente;
    @XmlElement(name = "Classe", namespace = "http://nfse.abrasf.org.br")
    protected String classe;
    @XmlElement(name = "Metodo", namespace = "http://nfse.abrasf.org.br")
    protected String metodo;
    @XmlElement(name = "CodigoErro", namespace = "http://nfse.abrasf.org.br")
    protected String codigoErro;
    @XmlElement(name = "DescricaoErro", namespace = "http://nfse.abrasf.org.br")
    protected String descricaoErro;
    @XmlElement(name = "MotivoErro", namespace = "http://nfse.abrasf.org.br")
    protected String motivoErro;
    @XmlElement(name = "Mensagem", namespace = "http://nfse.abrasf.org.br")
    protected String mensagem;

    /**
     * Obtém o valor da propriedade componente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponente() {
        return componente;
    }

    /**
     * Define o valor da propriedade componente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponente(String value) {
        this.componente = value;
    }

    /**
     * Obtém o valor da propriedade classe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasse() {
        return classe;
    }

    /**
     * Define o valor da propriedade classe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasse(String value) {
        this.classe = value;
    }

    /**
     * Obtém o valor da propriedade metodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * Define o valor da propriedade metodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodo(String value) {
        this.metodo = value;
    }

    /**
     * Obtém o valor da propriedade codigoErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoErro() {
        return codigoErro;
    }

    /**
     * Define o valor da propriedade codigoErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoErro(String value) {
        this.codigoErro = value;
    }

    /**
     * Obtém o valor da propriedade descricaoErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoErro() {
        return descricaoErro;
    }

    /**
     * Define o valor da propriedade descricaoErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoErro(String value) {
        this.descricaoErro = value;
    }

    /**
     * Obtém o valor da propriedade motivoErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoErro() {
        return motivoErro;
    }

    /**
     * Define o valor da propriedade motivoErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoErro(String value) {
        this.motivoErro = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

}
