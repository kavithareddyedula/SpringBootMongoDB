package com.healthcare.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.model.Customer;
import com.healthcare.service.CustomerService;


@RestController
public class CustomerController {
	//http://localhost:8080/Customer/id=2323232
	
	@Autowired
	CustomerService service;
	
	// CustomerService service = new CustomerService();
	
	@GetMapping(value="{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getCustomerMessage(@PathVariable( "id") String id) {
		
		Customer cust1 = new Customer();
		
		System.out.println("id  "+id);
		cust1.setId(id);
		
		return new ResponseEntity<Customer>(cust1,HttpStatus.ACCEPTED);
	}
	
	// 
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cus) {
		//Older way of mapping   we used manually or using jackson-bind jar 
		//for the mapping incoming to the POJO/model
		//customer cus = new Customer 
		// cus.setter....
		/*
		 *  New process:  this process is replaced by @RequestBody  which used internally the REFLECTION API ..
		 *   that means POJO class property name should match with incoming json keys 
		 * 
					 *   private String firstName;
				private String lastName;
				private String address;
				private int zipcode;
				==============
					 *   {
			    "firstName": "req1fn", 
			    "lastName": "req1ln",
			    "address": "2232323",
			    "zipcode": "47777"  }
		 */
	
		service.createCustomer(cus); 
		// when call service.anymethod for the first time it creates object, 
		// that object will be pooled  and cached --> by default this service is singleton  
		//  1. @RequestBody
		//   2. ResponseEntity 
		//  
		return new ResponseEntity<Customer>(cus,HttpStatus.ACCEPTED);
	}
	

}





// @RestController or @Controller == servlet --> httpservlet 
// syntax: public ResponseEntity<anyobject>/String/void/any other object 
// any method name which represents read operation   like get /find/read
// (@PathParam)
 // http//websiteadress()alias name//contextpath/vlaue--> path value -- path param 
// http://localhost:8080//Customer/2323232