package com.healthcare.claim;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	
	@GetMapping
	public ResponseEntity<String> getCustomerMessage() {
		
		return new ResponseEntity<String>("hi i am from controller GET method ",HttpStatus.ACCEPTED);
	}
	

}
