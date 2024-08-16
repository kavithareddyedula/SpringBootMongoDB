package com.healthcare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.healthcare.model.Customer;

/**
 *  DAO - data access object -- isolates DB interactions from other layers of the app 
 *  org.springframework.data --> spring data module  --> 
 *  
 *  public interface CustomerRepository extends MongoRepository<Model/entity, primarykeydatatype>{
 *  
 */

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
