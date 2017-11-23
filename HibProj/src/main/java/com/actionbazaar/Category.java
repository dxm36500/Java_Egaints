package com.actionbazaar;



import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	@Column(name="CREATE_DATE")
	@Temporal(TemporalType.DATE)
	private Date createDate;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<ItemEntityClass> item;
	
	public Category(Long categoryId, String categoryName, Date createDate) {
		
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.createDate = createDate;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	

	
	
	

}
