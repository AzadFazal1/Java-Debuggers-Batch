package com.BinaryLogic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.BinaryLogic.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public void addEmployee(Employee employee);

	public Optional<Employee> getEmployeeById(int myId);

	public ResponseEntity<?> deleteEmployeeByID(int myId);
}
