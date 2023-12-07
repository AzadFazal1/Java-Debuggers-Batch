package com.BinaryLogic.Runner;

import com.BinaryLogic.Dao.*;
import com.BinaryLogic.Model.*;

public class App {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		
		
//		Student student = new Student("Azad", "Fazal", "azad@blit.com");
//		//studentDao.saveStudent(student);
//		studentDao.insertStudent(student);
//		Student student = new Student("Shahzad", "Fazal", "azad@blit.com");
//		studentDao.updateStudent(student);
		
		studentDao.deleteStudent(10);

		
	}

}
