package com.vibhu.employeeMS.service;

import java.util.List;


import com.vibhu.employeeMS.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
    Employee saveEmployee(Employee employee);

}
