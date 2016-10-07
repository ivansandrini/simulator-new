package com.neogrid.simulator.enums;

public enum WebServiceType {
	CONSULTA_LOTE(1),
	RECEPCAO_LOTE_RPS(2),
	CONSULTA_SITUACAO_LOTE(3),
	CONSULTA_NFSE_POR_RPS(4);
	
	private Integer type;
	
	private WebServiceType(final Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

}
