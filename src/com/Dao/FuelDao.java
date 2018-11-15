package com.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Fuel;
import com.Model.User;
import com.Util.DbUtil;
import com.mysql.jdbc.Connection;

public class FuelDao {


	public static int addFuel(Fuel fuel) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i = 0;
		try {
			ps = connection.prepareStatement("insert into fueltype(Fuel_Type) values(?)");
			//ps.setInt(1, fuel.getFuelid());
			ps.setString(1, fuel.getFuelname());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public static List<Fuel> getFuel() {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Fuel> fuels = new ArrayList<Fuel>();
		try {
			 ps = connection.prepareStatement("select * from fueltype");
			 rs= ps.executeQuery();
			 
			 while(rs.next()){
				 
				 Fuel fuel = new Fuel();
				 fuel.setFuelid(rs.getInt("Fuel_Type_Id"));
				 fuel.setFuelname(rs.getString("Fuel_Type"));
				 fuels.add(fuel);
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fuels;
	}
	public static int deleteFuel(int id) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i =0;
		try {
			 ps = connection.prepareStatement("delete from fueltype where Fuel_Type_Id = ?");
			 ps.setInt(1,id);
			 
			 i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	public static Fuel findFuel(int id) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Fuel fuel = null;
		try {
			 ps = connection.prepareStatement("select * from fueltype");
			 rs= ps.executeQuery();
			 
			 while(rs.next()){
				 
				 fuel = new Fuel();
				 fuel.setFuelid(rs.getInt("Fuel_Type_Id"));
				 fuel.setFuelname(rs.getString("Fuel_Type"));
				 
				 
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fuel;
	}
	public static int updateFuel(Fuel fuel) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i =0;
		try {
			 ps = connection.prepareStatement("update fueltype set Fuel_Type = ? where Fuel_Type_Id = ?");
			 ps.setString(1, fuel.getFuelname());
			 ps.setInt(2, fuel.getFuelid());
			
			 
			 i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	


	
}
