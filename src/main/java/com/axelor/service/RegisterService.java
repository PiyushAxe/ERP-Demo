package com.axelor.service;

//import org.hibernate.Query;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
import com.axelor.util.HibernateUtil;
import com.axelor.model.User;



public class RegisterService {
     
public boolean register(User user){
     Session session = HibernateUtil.openSession();
     if(isUserExists(user)) {
    	 return false;  
     }
     
     Transaction tx = null;
     try {
    	 
         tx = session.getTransaction();
         tx.begin();
         session.saveOrUpdate(user);       
         tx.commit();
         
     } catch (Exception e) {
         if (tx != null) {
             tx.rollback();
         }
         e.printStackTrace();
     } finally {
         session.close();
     } 
     return true;
}
 
public boolean isUserExists(User user){
	
     Session session = HibernateUtil.openSession();
     boolean result = false;
     Transaction tx = null;
     
     try{
         tx = session.getTransaction();
         tx.begin();
         Query query = session.createQuery("from User where userId=" +user.getUserId() + "");
		User u = (User)query.uniqueResult();
         tx.commit();
         if(u!=null) result = true;
         
     }catch(Exception ex){
    	 
         if(tx!=null){
        	 
             tx.rollback();
             
         }
         
     }finally{
    	 
         session.close();
         
     }
     return result;
}
	public void deleteUser(User u) {
	
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
	
		try {
		
		tx = session.getTransaction();
		tx.begin();
		session.delete(u);
		System.err.println("User is deleted");
		tx.commit();
		
		}catch(Exception ex) {
			
			if(tx!=null) {
				
				tx.rollback();
				
			}
		
		}finally {
		
			session.close();
		
			}
	
		}
	}