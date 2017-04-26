package com.neogrid.simulator.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Resposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@Lob
	private byte[] mensagem;
	
	@OneToOne
	@JoinColumn(name="tipo_id")
	private Tipo tipo;
	
	@OneToOne
	@JoinColumn(name="layout_id")
	private Layout layout;
	
	private String ip;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="resposta")
	@Cascade(value= {CascadeType.SAVE_UPDATE, CascadeType.DELETE })
	public List<ParametroResposta> parametros;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getMensagem() {
		return mensagem;
	}

	public void setMensagem(byte[] mensagem) {
		this.mensagem = mensagem;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Layout getLayout() {
		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public List<ParametroResposta> getParametros() {
		return parametros;
	}

	public void setParametros(List<ParametroResposta> parametros) {
		this.parametros = parametros;
	}

	@Transient
	public String getTextMessage() {
		String textMessage = "";
		if(this.getMensagem() != null) {
			textMessage = new String(this.getMensagem());
		}
		return textMessage;
	}
	
}