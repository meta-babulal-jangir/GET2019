package com.metacube.studentHib.controller;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.metacube.studentHib.dao.StudentDAO;
import com.metacube.studentHib.model.StudentForm;
import com.metacube.studentHib.model.pojo.Student;


/**
 * @author Babulal Jangir
 *
 */
@Controller
public class HomeController {
	@Autowired
	StudentDAO studentDao;
	private static final Logger log = LoggerFactory.getLogger(StudentForm.class);
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/AddStudentDetails")
	public String addStudentDeatils(Model model) {
		model.addAttribute(new StudentForm());
		log.info("1 \n\n\n\n\n\n\n\n\n\n\n\n\n: ");
		return "AddStudentDetails";
	}
	
	@PostMapping("/AddStudentDetails")
	public String addStudentDetails(@Validated StudentForm student,	BindingResult result) {
		if (result.hasErrors()) {
			return "AddStudentDetails";
		} else {
			
			Student studentDb=new Student();
			studentDb.setFirstName(student.getFirstName());
			studentDb.setLastName(student.getLastName());
			studentDb.setFatherName(student.getFatherName());
			studentDb.setEmail(student.getEmail());
			studentDb.setStudentClass(student.getStudentClass());
			studentDb.setAge(student.getAge());
			studentDao.addStudent(studentDb);
		//	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		//	SessionFactory sessionFactory=con.buildSessionFactory();
		//	Session session=sessionFactory.openSession();
		//	Transaction transaction=session.beginTransaction();
		//	session.save(studentDb);
		//	transaction.commit();
			
			log.info("First Name : " + student.getFirstName());
			log.info("Last Name : " + student.getLastName());
			log.info("Father Name : " + student.getFatherName());
			log.info("Email Id : " + student.getEmail());
			log.info("Student Class : " + student.getStudentClass());
			log.info("Student Age : " + student.getAge());

			return "redirect:/home";
		}
	}
	
	@GetMapping("/ShowAllStudent")
	public String showStudentDetails(Model model) {

		//ArrayList<StudentForm> list = new ArrayList<StudentForm>();
		//list = AllStudent.getStudent();
		
		List<Student> list = new ArrayList<Student>();
		list=studentDao.showAllStudent();
		model.addAttribute("student1", list);

		return "ShowStudentDetails";
	}
	
}
