package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Babulal Jangir 
 * Servlet to update Student details in database
 */
public class UpdateStudentDetail extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		Student student=new Student();
		student.setStudentId(Integer.parseInt(req.getParameter("student_id")));
		student.setFirstName(req.getParameter("first_name"));
		student.setLastName(req.getParameter("last_name"));
		student.setFatherName(req.getParameter("father_name"));
		student.setEmail(req.getParameter("email"));
		student.setStudentClass(Integer.parseInt(req.getParameter("class")));
		student.setAge(Integer.parseInt(req.getParameter("age")));
		boolean updated=DatabaseHelper.updateStudent(student);
		if(updated)
			out.println("Updated Sucessfully");
		else
			out.println("Not updated");
		
	}
}
