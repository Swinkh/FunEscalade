package com.jonathanweb.funescalade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathanweb.funescalade.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, String>{}
