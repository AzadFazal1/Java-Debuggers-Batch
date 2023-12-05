package com.BinaryLogic.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.BinaryLogic.Model.Student;
import com.BinaryLogic.Util.HibernateUtil;

public class StudentDao {
	// saveStudent
	public void saveStudent(Student student) {
		
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			transaction = session.beginTransaction();
			
			session.save(student);
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		
	}
	
	
	// getAllStudents
	
	
	// getStudentById
	
	
	// UpdateStudent
	
	
	// DeleteStudent
}
