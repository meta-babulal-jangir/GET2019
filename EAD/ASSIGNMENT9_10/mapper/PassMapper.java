/**
 * Pass Mapper Class
 */
package com.metacube.Parking.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.metacube.Parking.model.PassDTO;

public class PassMapper implements RowMapper<PassDTO>{

	@Override
	public PassDTO mapRow(ResultSet resultSet, int arg1) throws SQLException {
		PassDTO pass = new PassDTO();
		pass.setDaily(resultSet.getDouble("daily"));
		pass.setMonthly(resultSet.getDouble("monthly"));
		pass.setYearly(resultSet.getDouble("yearly"));
		return pass;
	}
}
