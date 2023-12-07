package com.BinaryLogic.Dao;

import java.util.List;

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
	
	public List<Student> getAllStudents() {
		Transaction transaction = null;
		List<Student> students = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			transaction = session.beginTransaction();
			
			students = session.createQuery("from Student").list();
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		return students;
		
		
	}
	
	
	// getStudentById
	
	public Student getStudentById(int myID) {
		Transaction transaction = null;
		Student student = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			transaction = session.beginTransaction();
			
			student = session.get(Student.class, myID);
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		return student;
	}
	
	// UpdateStudent
	
public void updateStudent(Student student) {
		
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			transaction = session.beginTransaction();
			
			session.saveOrUpdate(student);
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		
	}
public void deleteStudent(int id) {
	
	Transaction transaction = null;
	Student student = null;
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		transaction = session.beginTransaction();
		
		student = session.get(Student.class, id);
		session.delete(student);
		transaction.commit();
	}
	catch(Exception e) {
		if(transaction!=null) {
			transaction.rollback();
		}
	}
	
}
	
	
	// DeleteStudent
}
