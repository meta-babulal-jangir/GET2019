package com.servlets;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Babulal Jangir
 * Helper class of database which contains  method to perform operation on database 
 */
public class DatabaseHelper {
	/**
	 * Method to add student data into database
	 * @param student
	 * @return 1 if student data added successfully otherwise MYSQL ERROR code 
	 */
	public static int addStudent(Student student) {

		try {
			Connection con = SQLConnection.getConnection("school");
			String query = "INSERT INTO student(first_name,last_name,father_name,email,class,age) values(?,?, ?, ?, ?,?)";

			PreparedStatement preStatement = con.prepareStatement(query);
			preStatement.setString(1, student.getFirstName());
			preStatement.setString(2, student.getLastName());
			preStatement.setString(3, student.getFatherName());
			preStatement.setString(4, student.getEmail());
			preStatement.setInt(5, student.getStudentClass());
			preStatement.setInt(6, student.getAge());
			int rowAffected = preStatement.executeUpdate();
			con.close();
			return rowAffected;
		} catch (SQLException sqlException) {
			//sqlException.printStackTrace();
			return sqlException.getErrorCode();
		}

	}

	/**
	 * Method to get  LIst of student from database
	 * @return List of student
	 */
	public static List<Student> getAllStudents() {
		List<Student> listOfStudents = new ArrayList<Student>();
		try {
			Connection con = SQLConnection.getConnection("school");
			String query = "SELECT student_id,first_name,last_name,father_name,email,class,age FROM student";
			Statement statement = con.createStatement();
			ResultSet studentsData = statement.executeQuery(query);

			Student student = null;
			while (studentsData.next()) {
				student = new Student();
				student.setStudentId(Integer.parseInt(studentsData.getString(1)));
				student.setFirstName(studentsData.getString(2));
				student.setLastName(studentsData.getString(3));
				student.setFatherName(studentsData.getString(4));
				student.setEmail(studentsData.getString(5));
				student.setStudentClass(Integer.parseInt(studentsData
						.getString(6)));
				student.setAge(Integer.parseInt(studentsData.getString(7)));
				listOfStudents.add(student);
			}
			con.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return listOfStudents;
	}

	/**
	 * Method to update student data into database
	 * @param student
	 * @return 1 if student data updated successfully otherwise MYSQL ERROR code 
	 */
	public static int updateStudent(Student student) {

		try {
			Connection con = SQLConnection.getConnection("school");
			String query = "UPDATE student SET first_name=?,last_name=?,father_name=? ,email=?,class=? ,age=? WHERE student_id=?";

			PreparedStatement preStatement = con.prepareStatement(query);
			preStatement.setString(1, student.getFirstName());
			preStatement.setString(2, student.getLastName());
			preStatement.setString(3, student.getFatherName());
			preStatement.setString(4, student.getEmail());
			preStatement.setInt(5, student.getStudentClass());
			preStatement.setInt(6, student.getAge());
			preStatement.setInt(7, student.getStudentId());
			int rowUpdated = preStatement.executeUpdate();
			con.close();
			return rowUpdated;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return sqlException.getErrorCode();
		}
	}
	
	
	/**
	 * Method to search student  into database by first name and last name
	 * @param firstName
	 * @param lastName
	 * @return List of student
	 */
	public static List<Student> searchStudentByName(String firstName,String lastName) {
		List<Student> listOfStudents = new ArrayList<Student>();
		try {
			Connection con = SQLConnection.getConnection("school");
			String query = "SELECT student_id,first_name,last_name,father_name,email,class,age FROM student WHERE first_name='"+firstName+"' AND last_name='"+lastName+"'";
			Statement statement = con.createStatement();
			ResultSet studentsData = statement.executeQuery(query);

			Student student = null;
			while (studentsData.next()) {
				student = new Student();
				student.setStudentId(Integer.parseInt(studentsData.getString(1)));
				student.setFirstName(studentsData.getString(2));
				student.setLastName(studentsData.getString(3));
				student.setFatherName(studentsData.getString(4));
				student.setEmail(studentsData.getString(5));
				student.setStudentClass(Integer.parseInt(studentsData
						.getString(6)));
				student.setAge(Integer.parseInt(studentsData.getString(7)));
				listOfStudents.add(student);
			}
			con.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return listOfStudents;
	}
	
	/**
	 * Method to search student  into database by first class
	 * @param studentClass is int type 
	 * @return List of students
	 */
	public static List<Student> searchStudentByClass(int studentClass) {
		List<Student> listOfStudents = new ArrayList<Student>();
		try {
			Connection con = SQLConnection.getConnection("school");
			String query = "SELECT student_id,first_name,last_name,father_name,email,class,age FROM student WHERE class='"+studentClass+"'";
			Statement statement = con.createStatement();
			ResultSet studentsData = statement.executeQuery(query);

			Student student = null;
			while (studentsData.next()) {
				student = new Student();
				student.setStudentId(Integer.parseInt(studentsData.getString(1)));
				student.setFirstName(studentsData.getString(2));
				student.setLastName(studentsData.getString(3));
				student.setFatherName(studentsData.getString(4));
				student.setEmail(studentsData.getString(5));
				student.setStudentClass(Integer.parseInt(studentsData
						.getString(6)));
				student.setAge(Integer.parseInt(studentsData.getString(7)));
				listOfStudents.add(student);
			}
			con.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return listOfStudents;
	}

}
