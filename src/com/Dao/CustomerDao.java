package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Customer;
import com.Util.DbUtil;

public class CustomerDao {

	
	public static int addCustomer(Customer customer) {
		
		Connection connection = DbUtil.getCon();
		PreparedStatement ps =null;
		
		int i = 0;
		
		try {
			ps = connection.prepareStatement("insert into customer(Customer_Name,Email_Id) values(?,?)");
			
			ps.setString(1, customer.getCustomername());
			ps.setString(2, customer.getEmail());
			
			i =ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i ;
		
		
		
	}
	
	public static List<Customer> getCustomer() {
		
		Connection connection = DbUtil.getCon();
		
		PreparedStatement ps =null;
		
		ResultSet rs = null;
		
		List<Customer> customers = new ArrayList<Customer>();
		
		try {
			ps = connection.prepareStatement("select * from customer");
			
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Customer customer = new Customer();
				
				customer.setCustomerid(rs.getInt("Customer_Id"));
				customer.setCustomername(rs.getString("Customer_Name"));
				customer.setEmail(rs.getString("Email_Id"));
				customers.add(customer);
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return customers;
		
	}
	
	
	
}
