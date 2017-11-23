	package com.actionbazaar;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "bids")
public class BidsClass implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@Column(name = "bid_id")
		private int bidId;
		@Column(name = "bid_price")
		private float bidPrice;
		@Column(name = "bid_date")
		@Temporal(TemporalType.DATE)
		private Date bidDate;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="item_id")
		private ItemEntityClass item;

		
		public BidsClass() {
			// TODO Auto-generated constructor stub
		}
		
		

		public BidsClass(int bidId, float bidPrice, Date bidDate) {
			
			this.bidId = bidId;
			this.bidPrice = bidPrice;
			this.bidDate = bidDate;
		}



		public BidsClass(int bidId, float bidPrice, Date bidDate, ItemEntityClass item) {
			
			this.bidId = bidId;
			this.bidPrice = bidPrice;
			this.bidDate = bidDate;
			this.item = item;
		}




		public int getBidId() {
			return bidId;
		}


		public void setBidId(int bidId) {
			this.bidId = bidId;
		}


		public float getBidPrice() {
			return bidPrice;
		}


		public void setBidPrice(float bidPrice) {
			this.bidPrice = bidPrice;
		}


		public Date getBidDate() {
			return bidDate;
		}


		public void setBidDate(Date bidDate) {
			this.bidDate = bidDate;
		}


		public ItemEntityClass getItem() {
			return item;
		}


		public void setItem(ItemEntityClass item) {
			this.item = item;
		}
	}


