package com.akash.app1.repository;

//import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.app1.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
//	Optional<List<Employee>> findEmployeeByEmpcity(String emp_city);
}
