package com.example.hcl.MortGage.entity;


	
	import java.time.LocalDate;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
		
		
	
	@Entity
	@Table(name = "User")
	public class User {
		@Id
		@Column(name = "name")
		private String name;
		@Column(name = "dob")
		private LocalDate dob;
		@Column(name = "gender")
		private int gender;
		@Column(name = "salary")
		private int salary;
		@Column(name = "pan_Number")
		private int panNumber;
		@Column(name = " Type")
		private String type;
		@Column(name = "property_Address")
		private String propertyAddress;
		@Column(name = "property_Pincode")
		private int propertyPincode;
		@Column(name = "property_Area_Size")
		private int propertyAreaSize;
	
		
		public int getPropertyAreaSize() {
			return propertyAreaSize;
		}
		public void setPropertyAreaSize(int propertyAreaSize) {
			this.propertyAreaSize = propertyAreaSize;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public int getGender() {
			return gender;
		}
		public void setGender(int gender) {
			this.gender = gender;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getPanNumber() {
			return panNumber;
		}
		public void setPanNumber(int panNumber) {
			this.panNumber = panNumber;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getPropertyAddress() {
			return propertyAddress;
		}
		public void setPropertyAddress(String propertyAddress) {
			this.propertyAddress = propertyAddress;
		}
		public int getPropertyPincode() {
			return propertyPincode;
		}
		public void setPropertyPincode(int propertyPincode) {
			this.propertyPincode = propertyPincode;
		}
		
		

}
