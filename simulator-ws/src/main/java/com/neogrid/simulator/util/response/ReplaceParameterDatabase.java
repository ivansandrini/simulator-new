package com.neogrid.simulator.util.response;

public class ReplaceParameterDatabase implements ReplaceParameter {
	
	private String key;
	private String value;
	private String message;

	public ReplaceParameterDatabase(String key, String value, String message) {
		this.key = key;
		this.value = value;
		this.message = message;
	}

	@Override
	public String replace() {
		return ResponseUtils.substituiParametro(key, value, message);
	}

}
