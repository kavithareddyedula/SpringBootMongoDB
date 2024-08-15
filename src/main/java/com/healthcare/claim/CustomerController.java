package com.healthcare.claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.claim.model.Customer;
import com.healthcare.service.CustomerService;

import jakarta.websocket.server.PathParam;

@RestController
public class CustomerController {
	//http://localhost:8080/Customer/id=2323232
	
	@Autowired
	CustomerService service;
	
	@GetMapping(value="{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getCustomerMessage(@PathVariable( "id") String id) {
		
		Customer cust1 = new Customer();
		
		System.out.println("id  "+id);
		cust1.setId(Integer.parseInt(id));
		
		return new ResponseEntity<Customer>(cust1,HttpStatus.ACCEPTED);
	}
	
	// 
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cus) {
		
	
		service.createCustomer(cus);
		
		return new ResponseEntity<Customer>(cus,HttpStatus.ACCEPTED);
	}
	

}





// @RestController or @Controller == servlet --> httpservlet 
// syntax: public ResponseEntity<anyobject>/String/void/any other object 
// any method name which represents read operation   like get /find/read
// (@PathParam)
 // http//websiteadress()alias name//contextpath/vlaue--> path value -- path param 
// http://localhost:8080//Customer/2323232