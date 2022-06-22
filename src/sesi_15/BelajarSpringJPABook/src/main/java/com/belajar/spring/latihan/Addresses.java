package com.belajar.spring.latihan;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Addresses {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private BigInteger id;

	private String city;
	private String country;
	private String state;
	private String street;
	private String zip_code;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	public Addresses() {

	}

	public Addresses(String city, String country, String state, String street, String zip_code, User user) {
		this.city = city;
		this.country = country;
		this.state = state;
		this.street = street;
		this.zip_code = zip_code;
		this.user = user;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	@Override
	public String toString() {
		return "Address{" +
				"id=" + id +
				", city='" + city + '\'' + 
				", country='" + country + '\'' +
				", state='" + state + '\'' +
				", street='" + street + '\'' +
				", zip_code='" + zip_code + '\'' +
				", user='" + user.getName() + '\'' +
				'}';
	}


}
