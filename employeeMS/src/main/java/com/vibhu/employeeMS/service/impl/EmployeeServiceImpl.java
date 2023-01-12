package com.vibhu.employeeMS.service.impl;

import java.util.List;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.vibhu.employeeMS.entity.Employee;
import com.vibhu.employeeMS.repository.EmployeeRepository;
import com.vibhu.employeeMS.service.EmployeeService;
@Service
@Configuration

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	
	
	}
	
	

