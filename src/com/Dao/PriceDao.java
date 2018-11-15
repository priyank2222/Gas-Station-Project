package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Fuel;
import com.Model.Price;
import com.Model.Pump;
import com.Util.DbUtil;

public class PriceDao {

	public static List<Price> getPrice() {
		Connection connection = DbUtil.getCon();
		PreparedStatement ps =null;
		ResultSet rs = null;
		
		List<Price> prices = new ArrayList<Price>();
		
		try {
			ps = connection.prepareStatement("select * from price");
			rs = ps.executeQuery();
			while(rs.next())
			{
				Price price = new Price();
				price.setId(rs.getInt("id"));
				price.setPetrol(rs.getFloat("Petrol"));
				price.setDiesel(rs.getFloat("Diesel"));
				price.setPower(rs.getFloat("Power"));
				price.setMix(rs.getFloat("2TMIX"));
			
				prices.add(price);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prices;
	}

	
	public static Price findPrice(int id) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Price price = null;
		try {
			 ps = connection.prepareStatement("select * from price");
			 rs= ps.executeQuery();
			 
			 while(rs.next()){
				 
				 price = new Price();
				 price.setId(rs.getInt("id"));
				 price.setPetrol(rs.getFloat("Petrol"));
				 price.setDiesel(rs.getFloat("Diesel"));
				 price.setPower(rs.getFloat("Power"));
				 price.setMix(rs.getFloat("2TMIX"));
				 
				 
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return price;
	}
	public static int updatePrice(Price price) {
		java.sql.Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i =0;
		try {
			 ps = connection.prepareStatement("update price set Petrol = ? , Diesel = ? , Power = ? , 2TMIX = ? where id = 1");
			 ps.setFloat(1, price.getPetrol());
			 ps.setFloat(2, price.getDiesel());
			 ps.setFloat(3, price.getPower());
			 ps.setFloat(4, price.getMix());
			
			 
			 i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}


	
	
}














