package com.axelor.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.axelor.model.Student;
import com.axelor.model.User;
 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory;
 
    static {
        try {
        	
        	Configuration cfg = new Configuration();
        	cfg.addAnnotatedClass(User.class);
        	cfg.addAnnotatedClass(Student.class);
        	cfg.configure("hibernate.cfg.xml");
        	
        	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
        	
        	
            sessionFactory = cfg.buildSessionFactory(builder.build());
            
        } catch (Throwable ex) {
        	
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static Session openSession() {
    	
        return sessionFactory.openSession();
    }
}