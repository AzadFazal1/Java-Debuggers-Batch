package com.BinaryLogic.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.BinaryLogic.Model.Student;
import com.BinaryLogic.Util.HibernateUtil;

public class StudentDao {
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
	
	
	public void insertStudent(Student student) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			
			transaction = session.beginTransaction();
			
			String hql = "INSERT INTO Student (firstName, lastName, email)" + student
			;
			
			Query query =  session.createQuery(hql);
			
			int result = query.executeUpdate();
			System.out.println(result + " Row(s) affected");
			
			transaction.commit();
		
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void updateStudent(Student student) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			
			transaction = session.beginTransaction();
			
			String hql = "Update Student set firstName = :firstName " + "Where id =: id";
			
			
			
			Query query =  session.createQuery(hql);
			query.setParameter("firstName", student.getFirstName());
			query.setParameter("id", 1);
			
			int result = query.executeUpdate();
			System.out.println(result + " Row(s) affected");
			
			transaction.commit();
		
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int id) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			
			transaction = session.beginTransaction();
			
			
			Student student = session.get(Student.class, id);
			if(student != null) {
				String hql = "Delete from Student Where id = : id";
				Query query =  session.createQuery(hql);
				
				query.setParameter("id", 11);
				int result = query.executeUpdate();
				System.out.println(result + " Row(s) affected");

				
			}
				
			transaction.commit();
		
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public Student getStudent(int id) {
		Transaction transaction = null;
		Student student = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			
			transaction = session.beginTransaction();
			
			String hql = "From Student S Where S.id = : id";
			
			
			
			
			Query query =  session.createQuery(hql);
			query.setParameter("id", 1);
			
			List result = query.getResultList();
			if(result != null) {
				student = (Student) result.get(0);
			}
			System.out.println(result + " Row(s) affected");
			
			transaction.commit();
		
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return student;
	}
	

}
