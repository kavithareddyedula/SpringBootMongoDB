package com.healthcare.claim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongoDBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDBApplication.class, args);
	}

}

/*
 
 
 synstax--> main class <projectname>Application 
 
 
 CRUD - operations 
 
HTTPServletRequest  HTTPServletResponse 
 ...doGet(HTTPServletRequest req,  HTTPServletResponse res )

Spring f/w 

CRUD 

create --> PostMapping()

read--> GetMapping({})

update --> PutMapping() --> operation idempotency 

delete--> DeleteMapping({})

@SpringBootApplication ---> 1. it loads all the resouces / properties 
                            2. It scan the entire the project and look for annotations
                            3. weaving : associations and relationships information - meta data 
                            4. internationalization 

*/