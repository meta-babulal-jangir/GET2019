package Problem1;

/**
 * @author Babulal Jangir
 * class to Perform operations on Employee
 *
 */
public class Employee implements Comparable {
	private int empId;
	private String empName;
	private String empAddress;

	/**
	 * @param empId 
	 * @param empName
	 * @param empAddress
	 */
	public Employee(int empId, String empName, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	/**
	 * @return employee id in integer
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * Method updates employee In
	 * @param empId 
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return employee name
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * Method updates employee name
	 * @param empName 
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return employee address
	 */
	public String getEmpAddress() {
		return empAddress;
	}

	/**
	 * Method updates employee address
	 * @param empAddress
	 */
	public void setEmpAdresses(String empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * sorting of employee on the basis of the Id using the comparable
	 * @param emp is Employee object
	 */

	public int compareTo(Object emp) {
		int empId = ((Employee) emp).getEmpId();
		if (this.empId < empId)
			return -1;
		else if (this.empId > empId)
			return 1;
		else
			return 0;
	}

	/**
	 * method converts Employee object in readable form
	 */
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empAddress=" + empAddress + "]";
	}

	/**
	 * method compares two employee on the basis of empId
	 * @return true if both empId is same otherwise false
	 */
	public boolean equals(Object employee) {
		Employee emp1 = (Employee) employee;
		if (this.empId == emp1.getEmpId())
			return true;
		else
			return false;
	}
}