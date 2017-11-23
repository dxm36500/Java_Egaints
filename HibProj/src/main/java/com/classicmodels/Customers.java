package com.classicmodels;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	@Column(name="customerNumber")
	private int customerNumber;
	@Column(name="customerName")
	private String customerName;
	@Column(name="contactLastName")
	private String contactLastName;
	@Column(name="contactFirstName")
	private String contactFirstName;
	@Column(name="phone")
	private BigDecimal phone;
	@Column(name="addressLine1")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="postalcode")
	private long postalcode;
	@Column(name="country")
	private String country;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customerNumber")
	private Set<Orders> order;
	
	public Customers() {
	
	}

	public Customers(int customerNumber, String customerName, String contactLastName, String contactFirstName,
			BigDecimal phone, String address, String city, String state, long postalcode, String country) {
		
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.contactFirstName = contactFirstName;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
		this.country = country;
	}

	public Set<Orders> getOrder() {
		return order;
	}

	public void setOrder(Set<Orders> order) {
		this.order = order;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}



	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getContactLastName() {
		return contactLastName;
	}



	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}



	public String getContactFirstName() {
		return contactFirstName;
	}



	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}



	public BigDecimal getPhone() {
		return phone;
	}



	public void setPhone(BigDecimal phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
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



	public long getPostalcode() {
		return postalcode;
	}



	public void setPostalcode(long postalcode) {
		this.postalcode = postalcode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}

}
