package com.vibhu.employeeMS;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vibhu.employeeMS.entity.Employee;
import com.vibhu.employeeMS.repository.EmployeeRepository;

@SpringBootApplication
//@EnableAutoConfiguration
public class EmployeeMsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMsApplication.class, args);
	}

	
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Employee employee1 = new Employee("Vibhuti", "Grover", "vibhu@gmail.com");
		employeeRepository.save(employee1);
		
		Employee employee2 = new Employee("Sugandha", "Grover", "sugu@gmail.com");
		employeeRepository.save(employee2);
		
		Employee employee3 = new Employee("Ojas", "Grover", "ojo@gmail.com");
		employeeRepository.save(employee3);
		
	}

}
