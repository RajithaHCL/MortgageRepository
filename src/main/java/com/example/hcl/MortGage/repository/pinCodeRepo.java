package com.example.hcl.MortGage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hcl.MortGage.entity.Pincode;

@Repository

public interface pinCodeRepo extends JpaRepository<Pincode,Integer>{

	Pincode findByPincode (int pinCode);

	
}


