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
 *	Servlet to Edit student data 
 */
public class EditStudent extends HttpServlet {
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
		out.println("<table border=1>");
		out.println("<form action=UpdateStudentDetail method=GET >");
		out.println("<tr>");
		out.println("<td><label>Student ID</label></td>");
		out.println("<td><input type=text readonly name=student_id value="+student.getStudentId()+" /></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>First Name</label></td>");
		out.println("<td><input type=text name=first_name value="+student.getFirstName()+" /></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Last Name</label></td>");
		out.println("<td><input type=text name=last_name value="+student.getLastName()+" /></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Father Name</label></td>");
		out.println("<td><input type=text name=father_name value="+student.getFatherName()+" /></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Email ID</label></td>");
		out.println("<td><input type=text name=email value="+student.getEmail()+" /></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Class</label></td>");
		out.println("<td><input type=text name='class' value="+student.getStudentClass()+" /></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Age</label></td>");
		out.println("<td><input type=text name=age value="+student.getAge()+" /></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td colspan=2 ><input type=submit value=Update /></td>");
		out.println("</tr>");
		out.println("</form>");
		out.println("</table>");
		
		out.close();
	}
}