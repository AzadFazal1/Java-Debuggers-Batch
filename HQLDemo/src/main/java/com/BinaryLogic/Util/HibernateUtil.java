package com.BinaryLogic.Util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;
import com.BinaryLogic.Model.*;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			
			Properties properties = new Properties();
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL,  "jdbc:mysql://localhost:3306/hql_db");
			properties.put(Environment.USER,  "root");
			properties.put(Environment.PASS, "qwerty@123");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			properties.put(Environment.SHOW_SQL, "true");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Student.class);
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.build();
			
			sessionFactory =configuration.buildSessionFactory(serviceRegistry);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return sessionFactory;
		
	}
	
}
