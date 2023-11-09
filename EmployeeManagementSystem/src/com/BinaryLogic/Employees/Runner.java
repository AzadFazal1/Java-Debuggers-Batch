package com.BinaryLogic.Employees;


public class Runner {
	
//	public static void main() {
//		
//	}
//	public static void main(int a, int b) {
//		
//	}
	public static void main(String []args) {
		System.out.println(Employee.getNumberOfEmployees());

		//Test.getInstance();
		
		// Control Flow of Static
		
		// 1 - Identification of static members from top to bottom
		// 2 - Execution of static variable assignment and static blocks from top to bottom
		// 3 - Execution of main method
		Employee employee1 = new Employee();
		System.out.println(employee1.getEmployeeId());
		
		employee1.setEmployeeId(1);
		
		
		employee1.setFirstName("Srisandhya"); 
		
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee1.getFirstName());
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(2);
		employee2.setFirstName("Audie");
		employee2.setLastName("Ni");
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getFirstName());
		
		Employee employee3 = new Employee(3, "Amire");
		System.out.println(employee3.getEmployeeId());
		System.out.println(employee3.getFirstName());
		
		Employee employee4 = new Employee(4, "Saurang", "Singh");
		System.out.println(employee4.getEmployeeId());
		System.out.println(employee4.getFirstName());
		System.out.println(employee4.getLastName());
		System.out.println(employee4.getFullName());
		Employee employee5 = new Employee();
		System.out.println(Employee.getNumberOfEmployees());
		System.out.println(employee1.getSalary());
		System.out.println(employee2.getSalary());
		System.out.println(employee3.getSalary());
		System.out.println(employee4.getSalary());
		System.out.println(employee5.getSalary());
		
		System.out.println(employee4.getFullName());
		System.out.println(employee4.getFullName("-"));
	}

}
