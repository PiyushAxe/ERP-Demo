package com.axelor.service;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.Query;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.axelor.model.*;
import com.axelor.util.HibernateUtil;

public class StudentService {

	public boolean added(Student student) {

		Session session = HibernateUtil.openSession();

		if (isStudentExist(student)) {

			return false;

		}

		Transaction tx = null;

		try {

			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(student);
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

	public boolean isStudentExist(Student student) {

		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;

		try {

			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from User where userId='" + student.getId() + "'");
			@SuppressWarnings("deprecation")
			Student s = (Student) query.uniqueResult();
			tx.commit();
			if (s != null)
				result = true;

		} catch (Exception ex) {

			if (tx != null) {

				tx.rollback();

			}

		} finally {

			session.close();

		}
		return result;
	}

	public List<Student> getListOfStudent() {

		List<Student> list = new ArrayList<Student>();
		Session session = HibernateUtil.openSession();
		Transaction tx = null;

		try {

			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from Student").list();
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public void deleteStudent(Student stu) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;

		try {

			tx = session.getTransaction();
			tx.begin();
			session.delete(stu);
			System.err.println("User is deleted");
			tx.commit();

		} catch (Exception ex) {

			if (tx != null) {

				tx.rollback();

			}
		} finally {

			session.close();

		}

	}
}