package com.spring.spring_core.model;

public class Address {
	private String city;
	private String state;
	private String pinCode;
	
	
	public Address() {
		super();
		
	}
	public Address(String city, String state, String pinCode, String country) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
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
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String country;


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", country=" + country + "]";
	}
	
	
	 

}
