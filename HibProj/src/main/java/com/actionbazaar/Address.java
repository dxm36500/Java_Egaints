package com.actionbazaar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_address")
public class Address {
	
	@Id
	@Column(name="address_id")
	private int addressId;
	@Column(name="street_name1")
	private String streetName1;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="zipcode")
	private String zipcode;
	@Column(name="phone")
	private String phone;
	public Address(int addressId, String streetName1, String city, String state, String zipcode, String phone) {
		
		this.addressId = addressId;
		this.streetName1 = streetName1;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreetName1() {
		return streetName1;
	}
	public void setStreetName1(String streetName1) {
		this.streetName1 = streetName1;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
