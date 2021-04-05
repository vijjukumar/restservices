package com.vijju.restservices.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijju.restservices.model.Employee;

@RestController
public class EmployeeRest {
	
	@PostMapping ("/employees")
	public Employee createEmployee(@RequestBody Employee emp) {
		System.out.println("employees "+emp);
		return emp;
	}
	
	@GetMapping ("/employees/{empId}")
	public Employee getEmployee(@PathVariable String empId) {
		Employee emp = new Employee();
		return emp;
	}
	
	@DeleteMapping ("/employee/{empId}")
	public void deleteEmployee(@PathVariable String empId) {
		System.out.println("employee deleted");
		
	}
	
	@PutMapping ("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return emp;
	}


}
