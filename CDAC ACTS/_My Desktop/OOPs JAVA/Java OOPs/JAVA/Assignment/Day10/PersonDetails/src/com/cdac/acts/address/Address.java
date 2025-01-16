package com.cdac.acts.address;

public class Address {

	private String line1;
	private String line2;
	private String landmark;
	private String district;
	private String pin;
	
	public Address() {
		this.line1 = "";
		this.line2 = "";
		this.landmark = "";
		this.district = "";
		this.pin = "";
	}
	
	public Address(String line1, String line2, String landmark, String district, String pin) {
		this.line1 = line1;
		this.line2 = line2;
		this.landmark = landmark;
		this.district = district;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [" + line1 + "," + line2 + ", " + landmark + ", " + district
				+ ", PIN: " + pin + "]";
	}
}
