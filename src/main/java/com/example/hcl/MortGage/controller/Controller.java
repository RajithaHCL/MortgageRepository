package com.example.hcl.MortGage.controller;


import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hcl.MortGage.entity.User;
import com.example.hcl.MortGage.service.CalculateService;


@RestController
@RequestMapping("/user")

public class Controller {
	
	@Autowired
	
	
	CalculateService service;
	
	
	@PutMapping("/register")
	public void LoanUser(@RequestBody User user) throws Exception{
		if (user.getSalary()<10000) throw new Exception("salary should not be 10k below");
		LocalDate c = user.getDob();
		LocalDate cdate=LocalDate.now();
	          Period diff  =  Period.between(c,cdate );	
	          if (diff.getYears()<25) 
	        	  throw new Exception("Age should not be 25 years  below");
	          else {
	        	  service.loanUser(user);
	          }
	}

}
