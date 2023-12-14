package com.BinaryLogic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BinaryLogic.Dao.EmployeeRepository;
import com.BinaryLogic.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public Optional<Employee> getEmployeeById(int myId) {
		
		return employeeRepository.findById(myId);
		
	}

	@Override
	public ResponseEntity<?> deleteEmployeeByID(int myId) {
		Optional<Employee> employee = employeeRepository.findById(myId);
		if(employee.isPresent()) {
			employeeRepository.deleteById(myId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
