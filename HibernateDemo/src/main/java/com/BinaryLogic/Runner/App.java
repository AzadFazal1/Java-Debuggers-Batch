package com.BinaryLogic.Runner;
import com.BinaryLogic.Dao.*;
import com.BinaryLogic.Model.*;

public class App {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = new Student("Saurang", "Singh");
		studentDao.saveStudent(student);
		
	}

}
