/**
 * Employee Mapper Class
 */
package com.metacube.Parking.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.metacube.Parking.model.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet resultSet, int arg1) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployee_id(resultSet.getInt("employee_id"));
		employee.setGender(resultSet.getString("gender"));
		employee.setFull_name(resultSet.getString("full_name"));
		employee.setEmail(resultSet.getString("email"));
		employee.setPassword(resultSet.getString("password"));
		employee.setContact_number(resultSet.getString("contact_number"));
		employee.setOrg(resultSet.getString("org"));
		return employee;	
	}
}
