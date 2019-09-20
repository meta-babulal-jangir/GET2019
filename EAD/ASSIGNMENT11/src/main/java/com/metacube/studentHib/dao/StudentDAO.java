package com.metacube.studentHib.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.metacube.studentHib.model.pojo.Student;

/**
 * @author Babulal Jangir
 *
 */
@Repository
public class StudentDAO {
	@Autowired
	HibernateTemplate template;
	public void addStudent(Student studentDb) {
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sessionFactory=con.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(studentDb);
		transaction.commit();
	}
	
	public List<Student> showAllStudent() {
		List<Student> studentList=new ArrayList<Student>();
		
		studentList=template.loadAll(Student.class);
		
		
		return studentList;
	}
}
