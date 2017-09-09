package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private long id;
	private String firstname;
	private String lastname;
	private String address;
	private String postal;
	private String phone;
	private String email;
	
	//@OneToMany(mappedBy="customer")
	@OneToMany
	@JoinColumn(name="claim_id", referencedColumnName="customer_id")
	private List<Claim> claims;
	
	public Customer() {
		super();
		
	}
	
	public Customer(String firstName,String lastName,String address,String postal,String phone,String email) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.address = address;
		this.postal = postal;
		this.phone = phone;
		this.email = email;		
				
	}

	public long getId() {
		return id;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}
	

}
