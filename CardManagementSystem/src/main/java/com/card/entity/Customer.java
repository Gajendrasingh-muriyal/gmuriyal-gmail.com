/**
 * 
 */
package com.card.entity;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;


/**
 * @author Softway
 *
 */
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerid;
	
	private String name;
	
	private int mobileno;
	private String email;
	
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "customer")
	private Set<CardDetails> carddetails;
	
	
	
	public Customer(Set<CardDetails> carddetails)
	{ 	super();
		this.carddetails=carddetails;
	}

	public Customer()
	{
		
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<CardDetails> getUserbookingdetails() {
		return carddetails;
	}

	

	/**
	 * @param carddetails the carddetails to set
	 */
	public void setCarddetails(Set<CardDetails> carddetails) {
		this.carddetails = carddetails;
	}


	
	
}
