package com.example.hcl.MortGage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pincode")

public class Pincode {
	@Id
	@Column(name ="pincode")
	private int pincode;
	
	@Column(name ="sqft")
	private int sqft;

	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public void setSqft(int sqft) {
		this.sqft = sqft;
	}



	public int getSqft() {
		return sqft;
	}

	
	
	

}
