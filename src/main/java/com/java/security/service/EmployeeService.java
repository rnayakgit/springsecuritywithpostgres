package com.java.security.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.security.model.EmployeeModel;
import com.java.security.pojo.Employee;
import com.java.security.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public List<Employee> getEmployeeList() {
		List<EmployeeModel> list = repository.findEmployees();
		List<Employee> empList = new ArrayList<Employee>();
		ModelMapper modelmapper = new ModelMapper();
		for (EmployeeModel e : list) {
			empList.add(modelmapper.map(e, Employee.class));
		}
		return empList;
	}

}
