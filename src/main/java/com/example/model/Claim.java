package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Claim {
	@Id
	@GeneratedValue
	@Column(name="claim_id")
	private long id;
	private String category;
	private String description;
	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn (name = "customer_id")
	//private Customer customer;
	
	public Claim() {
		super();
	}
	
	public Claim(String category,String description) {
		this.category = category;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
/*
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	*/
	
	
}
