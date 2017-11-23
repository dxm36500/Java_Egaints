package com.actionbazaar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="creditcard")
public class CreditCard {
	
	@Id
	@Column(name="card_id")
	private Long creditCardId;
	@Column(name="name")
	private String nameOnCard;
	@Column(name="account_number")
	private String accountNumber;
	@Column(name="exp_month")
	private String expirationMonth;
	@Column(name="exp_year")
	private String expirationYear;
	@Column(name="code")
	private String securityCode;
	public CreditCard(Long creditCardId, String nameOnCard, String accountNumber, String expirationMonth,
			String expirationYear, String securityCode) {
		
		this.creditCardId = creditCardId;
		this.nameOnCard = nameOnCard;
		this.accountNumber = accountNumber;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
		this.securityCode = securityCode;
	}
	public Long getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(Long creditCardId) {
		this.creditCardId = creditCardId;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getExpirationMonth() {
		return expirationMonth;
	}
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public String getExpirationYear() {
		return expirationYear;
	}
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}
	public String getSecurityCode() {
		
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	

}
