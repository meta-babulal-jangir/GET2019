package com.servlets;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.*;
import javax.servlet.*;


/**
 * @author Babulal Jangir
 * Servlet to add Student data into database
 */
public class addStudentDetail extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println("In the servlet are following");
		Student student=new Student();
		student.setFirstName(req.getParameter("first_name"));
		student.setLastName(req.getParameter("last_name"));
		student.setFatherName(req.getParameter("father_name"));
		student.setEmail(req.getParameter("email_id"));
		student.setStudentClass(Integer.parseInt(req.getParameter("class")));
		student.setAge(Integer.parseInt(req.getParameter("age")));
		int added=DatabaseHelper.addStudent(student);
		if(added==1)
			out.println("Added Sucessfully");
		else if(added==1062)
			out.println("Email Id Already exists");
			else
				out.println("Some Error Accured");
	}
}
