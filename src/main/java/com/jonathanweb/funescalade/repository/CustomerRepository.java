package com.jonathanweb.funescalade.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jonathanweb.funescalade.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String Lastname);
	Customer findById(long id);

}
