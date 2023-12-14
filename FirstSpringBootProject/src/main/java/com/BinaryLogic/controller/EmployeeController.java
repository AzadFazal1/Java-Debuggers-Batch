package com.BinaryLogic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> getAllEmployees(){
		
		List<Employee> allEmployees = employeeService.getAllEmployees();
		if(allEmployees != null && !allEmployees.isEmpty()) {
			return new ResponseEntity(allEmployees, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		
		try{
			employeeService.addEmployee(employee);
			return new ResponseEntity<>(employee, HttpStatus.CREATED);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/{myId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int myId) {
		Optional<Employee> employee = employeeService.getEmployeeById(myId);
		if(employee.isPresent()) {
			return new ResponseEntity<>(employee.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{myId}")
	public ResponseEntity<?> deleteEmployeeByID(@PathVariable int myId) {
		return employeeService.deleteEmployeeByID(myId);
	}

}
