package com.actionbazaar;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "items")
public class ItemEntityClass  implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@Column(name = "item_id")
		private int itemId;
		@Column(name = "item_name")
		private String itemName;

		@Column(name = "created_date")
		@Temporal(TemporalType.DATE)
		private Date createdDate;

		@Column(name = "initial_price")
		private float initialPrice;

		@Column(name = "bid_start_date")
		@Temporal(TemporalType.DATE)
		private Date bidStartDate;

		@Column(name = "bid_end_date")
		@Temporal(TemporalType.DATE)
		private Date bidEndDate;

		//@OneToMany(cascade=CascadeType.ALL,mappedBy="item")
		//private Set<BidsClass> bids;
		
		@ManyToMany
		@JoinTable(name="categories_items",joinColumns= {@JoinColumn(name="CI_ITEM_ID")},inverseJoinColumns= {@JoinColumn(name="CI_CATEGORY_ID")})
		private Set<Category> category;

		
		public ItemEntityClass() {
			// TODO Auto-generated constructor stub
		}		


		public ItemEntityClass(int itemId, String itemName, Date createdDate, float initialPrice, Date bidStartDate,
				Date bidEndDate, Set<Category> category) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.createdDate = createdDate;
			this.initialPrice = initialPrice;
			this.bidStartDate = bidStartDate;
			this.bidEndDate = bidEndDate;
			this.category = category;
		}
		public int getItemId() {
			return itemId;
		}


		public void setItemId(int itemId) {
			this.itemId = itemId;
		}


		public String getItemName() {
			return itemName;
		}


		public void setItemName(String itemName) {
			this.itemName = itemName;
		}


		public Date getCreatedDate() {
			return createdDate;
		}


		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}


		public float getInitialPrice() {
			return initialPrice;
		}


		public void setInitialPrice(float initialPrice) {
			this.initialPrice = initialPrice;
		}


		public Date getBidStartDate() {
			return bidStartDate;
		}


		public void setBidStartDate(Date bidStartDate) {
			this.bidStartDate = bidStartDate;
		}


		public Date getBidEndDate() {
			return bidEndDate;
		}


		public void setBidEndDate(Date bidEndDate) {
			this.bidEndDate = bidEndDate;
		}

		

	}



