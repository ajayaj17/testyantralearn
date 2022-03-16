package com.finalkeyword;

public class Address {
	String city;
	String state;

	public Address() {
		super();
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
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

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		int result = 5;
		result = result + ((city == null) ? 0 : city.hashCode());
		result = result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Address a = (Address) obj;
		if (city == null) {
			if (this.city == a.city)
				return true;
			if (state == null)
				if (this.state==a.state)
					return true;
		}
		return false;

	}

}