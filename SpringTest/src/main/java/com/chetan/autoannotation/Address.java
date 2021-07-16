package com.chetan.autoannotation;

public class Address {
	private String street;
	private String city;

	public Address() {
			System.out.println("Address not parameter constructor called");
	}
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
		System.out.println("Address constructor called");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
