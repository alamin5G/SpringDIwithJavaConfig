package com.goonok.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("Masimpur, Zinnat Moholla")
	private String street;

	@Value("Tongi")
	private String city;

	@Value("1271")
	private String postcode;

	/*
	 * public Address(String street, String city, String postcode) { super();
	 * this.street = street; this.city = city; this.postcode = postcode; }
	 */

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

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postcode=" + postcode + "]";
	}

}
