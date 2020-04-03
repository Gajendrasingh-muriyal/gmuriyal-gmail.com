/**
 * 
 */
package com.card.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




/**
 * @author Softway
 *
 */
@Entity
public class CardDetails {
	
	@Id
	@GeneratedValue
	private int cardid;
	
	@NotNull
	@Size(max=16,min=16, message="card no is auto generated")
	@GeneratedValue
	private int cardno;
	
	
	private int cvv;

	private String cardname;

	private String cardtype;

	private Date expiredate;
	
	private int customerid;
	
	private String reason;
	
	private boolean reissue;
	
	private Date lastmodifieddate;
	
	@ManyToOne
	@JoinColumn(name="fk_customerid")
	private Customer customer;
	
	public CardDetails(Customer customer)
	{
		super();
		this.customer=customer;
		
	}

	

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the cardid
	 */
	public int getCardid() {
		return cardid;
	}



	/**
	 * @param cardid the cardid to set
	 */
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}









	/**
	 * @return the cardno
	 */
	public int getCardno() {
		return cardno;
	}



	/**
	 * @param cardno the cardno to set
	 */
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}



	/**
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}



	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}



	/**
	 * @return the cardname
	 */
	public String getCardname() {
		return cardname;
	}



	/**
	 * @param cardname the cardname to set
	 */
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}



	/**
	 * @return the cardtype
	 */
	public String getCardtype() {
		return cardtype;
	}



	/**
	 * @param cardtype the cardtype to set
	 */
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}



	/**
	 * @return the expiredate
	 */
	public Date getExpiredate() {
		return expiredate;
	}



	/**
	 * @param expiredate the expiredate to set
	 */
	public void setExpiredate(Date expiredate) {
		this.expiredate = expiredate;
	}



	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}



	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}



	/**
	 * @return the reissue
	 */
	public boolean isReissue() {
		return reissue;
	}



	/**
	 * @param reissue the reissue to set
	 */
	public void setReissue(boolean reissue) {
		this.reissue = reissue;
	}



	/**
	 * @return the lastmodifieddate
	 */
	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}



	/**
	 * @param lastmodifieddate the lastmodifieddate to set
	 */
	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public CardDetails()
	{
		
	}

	
}
