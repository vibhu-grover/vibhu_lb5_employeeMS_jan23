package com.vibhu.employeeMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vibhu.employeeMS.entity.Employee;
import com.vibhu.employeeMS.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeSevice) {
		super();
		this.employeeService = employeeSevice;
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployees());
		return "employees";
		
	}
	
	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute ("employee") Employee employee) {
	 
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
		
	}

}
