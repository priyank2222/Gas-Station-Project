package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.User;
import com.Util.DbUtil;


public class LoginDao {
	
	public static User authenticate(User user) {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		java.sql.ResultSet rs = null;
		
		User user1 = null;
		try {
			 ps = connection.prepareStatement("select * from adminlogin where Email = '" + user.getEmail() +"' and Password = '" + user.getPassword() +"'");
			 rs= ps.executeQuery();
			 
			 while(rs.next()){
				 
				 user1 = new User();
				 user1.setId(rs.getInt("User_Id"));
				 user1.setEmail(rs.getString("Email"));
				 user1.setPassword(rs.getString("password"));
			 }
		}
			 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return user1;
}

}
