package com.servlets;

/**
 * @author Babulal Jangir
 * It is POJO class
 */
public class Student {
		private int studentId;
		private String firstName;
		private String lastName;
		private String fatherName;
		private String email;
		private int studentClass;
		private int age;
	  
		/**
		 * @return id of Student 
		 */
		public int getStudentId() {
	       return studentId;
		}
		/**
		 * Method to set student Id
		 * @param student id
		 */
	   	public void setStudentId(int studentId) {
	       this.studentId = studentId;
	   	}
		/**
		 * @return first name of Student 
		 */
		public String getFirstName() {
	       return firstName;
		}
		/**
		 * Method to set first name of student
		 * @param name
		 */
	   	public void setFirstName(String firstName) {
	       this.firstName = firstName;
	   	}
	   	/**
		 * @return last name of Student 
		 */
		public String getLastName() {
	       return lastName;
		}
		/**
		 * Method to set last name of student
		 * @param name
		 */
	   	public void setLastName(String lastName) {
	       this.lastName = lastName;
	   	}
	   	/**
	   	 * @return father's name of student
	   	 */
	   	public String getFatherName() {
	       return fatherName;
	   	}
	   /**
	    * Method to set father name
	    * @param fatherName
	    */
	   	public void setFatherName(String fatherName) {
	       this.fatherName = fatherName;
	   	}
	   /**
	    * @return email of student
	    */
	   	public String getEmail() {
	       return email;
	   	}
	   /**
	    * Method to set email of student
	    * @param email 
	    */
	   	public void setEmail(String email) {
	       this.email = email;
	   	}
	   /**
	    * @return student class
	    */
	   	public int getStudentClass() {
	       return studentClass;
	   	}
	   /**
	    * Method to set student Class
	    * @param studentClass
	    */
	   	public void setStudentClass(int studentClass) {
	       this.studentClass = studentClass;
	   	}
	   /**
	    * @return age of student
	    */
	   	public int getAge() {
	       return age;
	   	}
	   /**
	    * Method to set age 
	    * @param age 
	    */
	   	public void setAge(int age) {
	       this.age = age;
	   	}

}
