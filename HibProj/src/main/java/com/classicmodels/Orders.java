package com.classicmodels;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="orders")
public class Orders {
	@Id
	@Column(name="orderNumber")
	private int orderNumber;
	@Column(name="orderDate")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	@Column(name="requiredDate")
	@Temporal(TemporalType.DATE)
	private Date requiredDate;
	@Column(name="shippedDate")
	@Temporal(TemporalType.DATE)
	private Date shippedDate;
	@Column(name="status")
	private String status;
	
	
	public Orders() {
		
	}
	public Orders(int orderNumber, Date orderDate, Date requiredDate, Date shippedDate, String status) {
		
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.status = status;
	}


	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public Date getRequiredDate() {
		return requiredDate;
	}


	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}


	public Date getShippedDate() {
		return shippedDate;
	}


	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

}
