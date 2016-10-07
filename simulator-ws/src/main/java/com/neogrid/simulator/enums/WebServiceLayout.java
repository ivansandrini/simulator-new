package com.neogrid.simulator.enums;

public enum WebServiceLayout {
	GINFES(1),
	PRODAM(2),
	SILTECNOLOGIA(3),
	SAATRI(4);
	
	private Integer layout;
	
	private WebServiceLayout(final Integer layout) {
		this.layout = layout;
	}

	public Integer getLayout() {
		return layout;
	}

}
