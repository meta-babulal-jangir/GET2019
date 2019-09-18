/**
 * Vehicle- Mapper Class
 */
package com.metacube.Parking.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.metacube.Parking.model.Vehicle;

public class VehicleMapper implements RowMapper<Vehicle>{

	@Override
	public Vehicle mapRow(ResultSet resultSet, int arg1) throws SQLException {
		Vehicle vehicle = new Vehicle();
		vehicle.setEmployee_id(resultSet.getInt("employee_id"));
		vehicle.setIdentification(resultSet.getString("identification"));
		vehicle.setName(resultSet.getString("name"));
		vehicle.setType(resultSet.getString("type"));
		vehicle.setVehicle_id(resultSet.getInt("vehicle_id"));
		vehicle.setVehicle_number(resultSet.getInt("vehicle_number"));
		return vehicle;
	}
}
