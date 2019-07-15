package com.example.hcl.MortGage.service;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hcl.MortGage.entity.Loan;
import com.example.hcl.MortGage.entity.Pincode;
import com.example.hcl.MortGage.entity.User;
import com.example.hcl.MortGage.repository.loanRepo;
import com.example.hcl.MortGage.repository.pinCodeRepo;
import com.example.hcl.MortGage.repository.userRepo;

@Service
public class CalculateService{


		@Autowired
		loanRepo loanRepo;

		@Autowired
		userRepo userRepo;

		@Autowired
		pinCodeRepo  pinRepo;






		public List<Loan> loanUser(User user) throws Exception{
			userRepo.save(user);

			Pincode  pindata =pinRepo.findByPincode (user.getPropertyPincode());
			//user.getPropertyAreaSize())*pindata.getSqft()<500000;
			if(pindata.getSqft() < 500000) {

				throw new Exception("user is  not eligible");
			} else {

				   int calculatedPrice = (int) (0.8*(user.getPropertyAreaSize()*pindata.getSqft()));			      
				List<Loan>  loanOffer= loanRepo.findByLoanAmmount( calculatedPrice);
				return loanOffer;

			}

		}

	}






