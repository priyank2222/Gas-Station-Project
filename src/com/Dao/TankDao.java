package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Fuel;
import com.Model.Tank;
import com.Util.DbUtil;


public class TankDao {

	public static int addTank(Tank tank)
	{
		Connection connection = DbUtil.getCon();
		Fuel fuel = null;
		java.sql.PreparedStatement ps = null;
		int i = 0;
		try {
			ps = connection.prepareStatement("insert into tank(Tank_Name,Fuel_Type_IdFk,Fuel_Balance) values(?,?,?)");
			ps.setString(1, tank.getTankname());
			ps.setInt(2, tank.getFuelid());
			ps.setFloat(3, tank.getFuelbalance());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}
	public static List<Tank> getTank() {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Tank> tanks = new ArrayList<Tank>();
		try {
			 ps = connection.prepareStatement("select * from tank");
			 rs= ps.executeQuery();
			 
			 while(rs.next()){
				 
				 Tank tank = new Tank();
				 tank.setId(rs.getInt("Tank_Id"));
				 tank.setTankname(rs.getString("Tank_Name"));
				 tank.setFuelid(rs.getInt("Fuel_Type_IdFk"));
				 tank.setFuelbalance(rs.getFloat("Fuel_Balance"));
				 tanks.add(tank);
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("list size in Dao>>>"+ tanks.size());
		return tanks;
	}
	public static int deleteTank(int id) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i =0;
		try {
			 ps = connection.prepareStatement("delete from tank where Tank_Id = ?");
			 ps.setInt(1,id);
			 
			 i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	public static Tank findTank(int id) {
		
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Tank tank = null;
		
		try {
			ps = connection.prepareStatement("select * from tank where Tank_Id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				tank = new Tank();
				tank.setId(rs.getInt("Tank_Id"));
				tank.setTankname(rs.getString("Tank_Name"));
				tank.setFuelid(rs.getInt("Fuel_Type_IdFk"));
				tank.setFuelbalance(rs.getFloat("Fuel_Balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tank;
	}
	
	public static int updateTank(Tank tank) {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			ps = connection.prepareStatement("update tank set Tank_Name = ? , Fuel_Type_IdFk = ? , Fuel_Balance = ? where Tank_Id = ?");
			ps.setString(1, tank.getTankname());
			ps.setInt(2, tank.getFuelid());
			ps.setFloat(3, tank.getFuelbalance());
			ps.setInt(4, tank.getId());
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
		

}
