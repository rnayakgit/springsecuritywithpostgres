package com.java.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.security.pojo.Employee;
import com.java.security.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployeeDetails() {
		return ResponseEntity.ok(service.getEmployeeList());
	}

}
