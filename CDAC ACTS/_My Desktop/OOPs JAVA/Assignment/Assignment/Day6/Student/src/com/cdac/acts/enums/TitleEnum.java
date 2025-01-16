package com.cdac.acts.enums;

public enum TitleEnum {
	PG_DAC("Diploma in Advanced Computing"),
	PG_DESD("Diploma in ESD"),
	PG_VLSI("Diploma in VLSI");
	
	private String value;
	private TitleEnum(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}

}
