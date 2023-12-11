package com.BinaryLogic.service;

import java.util.List;

import com.BinaryLogic.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public void addEmployee(Employee employee);

	public Employee getEmployeeById(int myId);

	public void deleteEmployeeByID(int myId);
}
