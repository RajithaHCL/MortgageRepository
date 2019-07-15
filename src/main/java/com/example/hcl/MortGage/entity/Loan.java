package com.example.hcl.MortGage.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Loan")
public class Loan {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int loan_id;
	
	@Column(name = "tenure")
	private int tenure;
	
	public int getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmi() {
		return emi;
	}

	public void setEmi(int emi) {
		this.emi = emi;
	}

	@Column(name = "loan_amount")
	private int loanAmount;
	
	@Column(name="email")
	private String email;
	
	@Column(name="emi")
	private int emi;
	


}
