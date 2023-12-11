package com.BinaryLogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BinaryLogic.model.Employee;
import com.BinaryLogic.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@GetMapping("/{myId}")
	public Employee getEmployeeById(@PathVariable int myId) {
		return employeeService.getEmployeeById(myId);
	}
	
	@DeleteMapping("/{myId}")
	public void deleteEmployeeByID(@PathVariable int myId) {
		employeeService.deleteEmployeeByID(myId);
	}

}
