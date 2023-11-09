package com.BinaryLogic.Employees;


public class Employee {
	
	private static int numberOfEmployees;
	
	private int employeeId;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String title;
	
	private String department;
	
	private float salary;
	
	
	static { // static block
		//salary = 3450; //error
		int x = 10;
		System.out.println(x);
	}
	
	{//instance block
		salary = 5600;
	}
	
	
	
	Employee(){ // Default Constructor or No arguments constructor
		System.out.println("I am here");
		++numberOfEmployees;
	}
	
	Employee(int newEmployeeId, String newFirstName){ //parameterized constructor
		
		employeeId= newEmployeeId;
		firstName = newFirstName;
		++numberOfEmployees;
		
		
	}
	
	Employee(int newEmployeeId, String newFirstName, String newLastName){ //parameterized constructor
		employeeId = newEmployeeId;
		firstName = newFirstName;
		lastName = newLastName;
		++numberOfEmployees;
		
	}
	
	int getEmployeeId(){
		return employeeId;
	}
	
	void setEmployeeId(int newId){
		employeeId = newId;
	}
	
	public String getLastName() {
		
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getTitle() {
		return title;
	}

	public String getDepartment() {
		return department;
	}

	public float getSalary() {
		return salary;
	}

	String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	void setFirstName(String newFirstName) {
		firstName = newFirstName;	
	}
	
	String getFullName() {
		return firstName + " " + lastName;
	}
	
	
	String getFullName(String delimiter) {
		return firstName + delimiter + lastName;
	}
	
	static int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	
	
	

}

