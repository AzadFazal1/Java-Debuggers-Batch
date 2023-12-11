package com.BinaryLogic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Employee getEmployeeById(int myId) {
		Optional<Employee> employee = employeeRepository.findById(myId);
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			return null;
		}
	}

	@Override
	public void deleteEmployeeByID(int myId) {
		employeeRepository.deleteById(myId);
	}

}
