package com.vibhu.employeeMS.repository;

import java.util.List;

//import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vibhu.employeeMS.entity.Employee;

//@Configuration
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	List<Employee> findAll();

}
