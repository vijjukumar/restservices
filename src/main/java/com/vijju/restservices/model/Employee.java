package com.vijju.restservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	public String empId;
	public String empName;
	public String empAddress;
	public String empSalary;
	
}
