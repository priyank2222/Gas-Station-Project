package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Attendant;
import com.Util.DbUtil;

public class AttendantDao {

	public static int addAttendant(Attendant attendant) {
		
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			ps = connection.prepareStatement("insert into employee(User_Name,First_Name,Last_Name,Email,Password,Address,Contact_No,Pump_Id,Shift) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, attendant.getUser_name());
			ps.setString(2, attendant.getName());
			ps.setString(3, attendant.getLastname());
			ps.setString(4, attendant.getEmail());
			ps.setString(5, attendant.getPassword());
			ps.setString(6,attendant.getAddress());
			ps.setString(7, attendant.getContact());
			ps.setInt(8, attendant.getPumpid());
			ps.setString(9, attendant.getShift());
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public static List<Attendant> getAttendant() {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Attendant> attendants = new ArrayList<Attendant>();
		try {
			ps = connection.prepareStatement("select * from employee");
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Attendant attendant = new Attendant();
				attendant.setId(rs.getInt("Employee_Id"));
				attendant.setName(rs.getString("First_Name"));
				attendant.setLastname(rs.getString("Last_Name"));
				attendant.setEmail(rs.getString("Email"));
				attendant.setPassword(rs.getString("Password"));
				attendant.setPumpid(rs.getInt("Pump_Id"));
				attendant.setShift(rs.getString("Shift"));
				attendants.add(attendant);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return attendants;
	}
	public static int deleteAttendant(int id) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i =0;
		try {
			 ps = connection.prepareStatement("delete from employee where Employee_Id = ?");
			 ps.setInt(1, id);
			 
			 i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	public static Attendant finAttendant(int id) {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Attendant attendant = null;
		
		try {
			ps = connection.prepareStatement("select * from employee");
			
			rs = ps.executeQuery();
			while (rs.next()) {
				attendant = new Attendant();
				attendant.setId(rs.getInt("Employee_Id"));
				attendant.setName(rs.getString("First_Name"));
				attendant.setLastname(rs.getString("Last_Name"));
				attendant.setEmail(rs.getString("Email"));
				attendant.setPassword(rs.getString("Password"));
				attendant.setPumpid(rs.getInt("Pump_Id"));
				attendant.setShift(rs.getString("Shift"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return attendant;
	}
	
	public static int updateAttendant(Attendant attendant) {
		
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i = 0;
		try {
			ps = connection.prepareStatement("update employee set First_Name=? , Last_Name = ? , Email = ? , Password = ? , Pump_Id = ? , Shift = ? where Employee_Id = ? ");
			ps.setString(1, attendant.getName());
			ps.setString(2, attendant.getLastname());
			ps.setString(3, attendant.getEmail());
			ps.setString(4, attendant.getPassword());
			ps.setInt(5, attendant.getPumpid());
			ps.setString(6, attendant.getShift());
			ps.setInt(7, attendant.getId());
			
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
}
