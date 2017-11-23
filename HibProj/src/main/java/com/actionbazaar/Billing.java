package com.actionbazaar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billing")
public class Billing {
	
	
	@Id
	@Column(name="billing_id")
	private long billing_id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address billing_address;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="card_id")
	private CreditCard creditcard;
	
	
	public Billing() {
		super();
	}

	public Billing(long billing_id, Address billing_address, CreditCard creditcard) {
		super();
		this.billing_id = billing_id;
		this.billing_address = billing_address;
		this.creditcard = creditcard;
	}

	public long getBilling_id() {
		return billing_id;
	}

	public void setBilling_id(long billing_id) {
		this.billing_id = billing_id;
	}

	public Address getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(Address billing_address) {
		this.billing_address = billing_address;
	}

	public CreditCard getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}
	
	
	
	

}
