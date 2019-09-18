/**
 *  DAO Interface 
 */
package com.metacube.Parking.dao;

import java.util.List;

import com.metacube.Parking.model.Employee;
import com.metacube.Parking.model.PassDTO;
import com.metacube.Parking.model.Vehicle;

public interface EmployeeDAO {

	/**
	 * @param emp
	 * @return
	 */
	public boolean addEmployee(Employee emp);

	/**
	 * @return
	 */
	public int getEmployeeId();

	/**
	 * @param email
	 * @return
	 */
	public String auth(String email);

	/**
	 * @param v
	 * @return
	 */
	public boolean addVehicle(Vehicle v);

	/**
	 * @param type
	 * @return
	 */
	public PassDTO getPrice(String type);

	/**
	 * @param email
	 * @return
	 */
	public Employee getEmployeeByEmail(String email);

	/**
	 * @param emp
	 * @return
	 */
	public boolean updateEmployee(Employee emp);

	/**
	 * @param imageURL
	 * @param email
	 * @return
	 */
	public boolean addImage(String imageURL, String email);

	/**
	 * @param email
	 * @return
	 */
	public List<Employee> getFriends(String email);	
}
