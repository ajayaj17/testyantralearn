package com.relationship;

public class LateInst_Address {

	private String streetName;
	private String city;
	private String state;

	public LateInst_Address() {
		super();
	}

	public LateInst_Address(String streetName, String city, String state) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
