package com.BinaryLogic.Runner;
import java.util.List;

import com.BinaryLogic.Dao.*;
import com.BinaryLogic.Model.*;

public class App {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
//		Student student = new Student("Amire", "Mohmed");
//		studentDao.saveStudent(student);
		
		List<Student> students =  studentDao.getAllStudents();
		for(Student student : students) {
			
			System.out.println(student);
		}
		
//		Student student1 = studentDao.getStudentById(1);
//		student1.setfName("Jeff");
//		studentDao.updateStudent(student1);
//		System.out.println(studentDao.getStudentById(1));
		//studentDao.deleteStudent(1);
		
		
		
	}

}
