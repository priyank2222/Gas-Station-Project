package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Pump;
import com.Model.Tank;
import com.Util.DbUtil;

public class PumpDao {

	public static int addPump(Pump pump) {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			ps = connection.prepareStatement("insert into pump(Pump_Name,Fuel_Type_Id,Tank_Id) values(?,?,?)");
			ps.setString(1, pump.getPumpname());
			ps.setInt(2, pump.getFuelid());
			ps.setInt(3, pump.getTankid());
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	
	public static List<Pump> getPump() {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps =null;
		ResultSet rs = null;
		
		List<Pump> pumps = new ArrayList<Pump>();
		
		try {
			ps = connection.prepareStatement("select * from pump");
			rs = ps.executeQuery();
			while(rs.next())
			{
				Pump pump = new Pump();
				pump.setId(rs.getInt("Pump_Id"));
				pump.setPumpname(rs.getString("Pump_Name"));
				pump.setFuelid(rs.getInt("Fuel_Type_Id"));
				pump.setTankid(rs.getInt("Tank_Id"));
			
				pumps.add(pump);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pumps;
	}
	
	public static int deletePump(int id) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i =0;
		try {
			 ps = connection.prepareStatement("delete from pump where Pump_Id = ?");
			 ps.setInt(1,id);
			 
			 i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	
	public static Pump findPump(int id) {
		
		Connection connection = DbUtil.getCon();
		PreparedStatement ps =null;
		ResultSet rs = null;
		Pump pump = null;
		
		try {
			ps = connection.prepareStatement("select * from pump where Pump_Id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next())
			{
				pump = new Pump();
				pump.setId(rs.getInt("Pump_Id"));
				pump.setPumpname(rs.getString("Pump_Name"));
				pump.setFuelid(rs.getInt("Fuel_Type_Id"));
				pump.setTankid(rs.getInt("Tank_Id"));
		
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pump;
	}
	public static int updatePump(Pump pump) {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			ps = connection.prepareStatement("update pump set Pump_Name = ? , Fuel_Type_Id = ? , Tank_Id = ? where Pump_Id = ?");
			ps.setString(1, pump.getPumpname());
			ps.setInt(2, pump.getFuelid());
			ps.setFloat(3, pump.getTankid());
		
			ps.setInt(4, pump.getId());
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	
	
	
}
