package com.healthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
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

@SpringBootApplication ---> 1. it loads all the resources / properties 
                            2. It scan the entire the project and look for annotations
                            3. weaving : associations and relationships information - meta data 
                            4. internationalization 
                            
                            exclude default data source which hikari by adding exclude = {DataSourceAutoConfiguration.class}
                            https://www.baeldung.com/spring-boot-hikari
                            

*/