
package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Attendant;
import com.Model.Setup;
import com.Model.User;
import com.Util.DbUtil;

public class SetupDao {

	public static int addSetup(Setup setup)
	{
		
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			ps = connection.prepareStatement("insert into setup(Pump,Tank) values(?,?)");
			ps.setInt(1, setup.getPump());
			ps.setInt(2, setup.getTank());
			i = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	public static Setup authenticate(Setup setup) {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		java.sql.ResultSet rs = null;
		
		Setup setup1 = null;
		try {
			 ps = connection.prepareStatement("select * from setup where Pump = '" + setup.getPump() +"' and Tank = '" + setup.getTank() +"'");
			 rs= ps.executeQuery();
			 
			 while(rs.next()){
				 
				 
				 setup1 = new Setup();
				 
				 setup1.setId(rs.getInt("id"));
				 setup1.setPump(rs.getInt("Pump"));
				 setup1.setTank(rs.getInt("Tank"));
			 }
		}
			 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return setup1;

	}
	
	public static List<Setup> getSetups() {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Setup> setups = new ArrayList<Setup>();
		try {
			ps = connection.prepareStatement("select * from setup");
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Setup setup = new Setup();
				setup.setId(rs.getInt("id"));
				 setup.setPump(rs.getInt("Pump"));
				 setup.setTank(rs.getInt("Tank"));
	
				
				setups.add(setup);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return setups;
	}
	
	
	
	
	
}
