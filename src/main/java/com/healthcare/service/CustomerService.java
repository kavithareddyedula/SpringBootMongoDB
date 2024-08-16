package com.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.model.Customer;
import com.healthcare.repository.CustomerRepository;

@Service
public class CustomerService {
	// service layer supports transaction management 
	@Autowired
	private CustomerRepository custRepository;
	
	public Customer createCustomer(Customer customer) {
		// repository
		
		 // json --model --db -->  property names should match 
		
		return custRepository.save(customer);
	}

}
