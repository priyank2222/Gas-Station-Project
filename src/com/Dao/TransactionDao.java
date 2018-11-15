package com.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Attendant;
import com.Model.FinalTransaction;
import com.Model.Transaction;
import com.Util.DbUtil;

public class TransactionDao {
	
public static int addTransaction(Transaction transaction) {
		
		Connection connection = DbUtil.getCon();
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			ps = connection.prepareStatement("insert into transaction(Fuel_Type_Id,Fuel_Amount,Pump_Id,Employee_Id,Date) values(?,?,?,?,?)");
			ps.setInt(1, transaction.getFuelid());
			ps.setFloat(2, transaction.getFuelamount());
			ps.setInt(3, transaction.getPumpid());
			ps.setInt(4, transaction.getEmpid());
			ps.setDate(5, transaction.getToday());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
public static List<FinalTransaction> getTransaction() {
	
	Connection connection = DbUtil.getCon();
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	List<FinalTransaction> transactions = new ArrayList<FinalTransaction>();
	
	try {
		ps = connection.prepareStatement("SELECT transaction.Transaction_Id , fueltype.Fuel_Type , transaction.Fuel_Amount , pump.Pump_Name , employee.First_Name , transaction.Date , transaction.Quantity ,tank.Tank_Name ,transaction.Shift  FROM TRANSACTION , fueltype , pump , employee, tank WHERE transaction.Fuel_Type_Id = fueltype.Fuel_Type_Id AND transaction.Pump_Id = pump.Pump_Id AND transaction.Employee_Id = employee.Employee_Id AND `pump`.`Tank_Id` = `Tank`.`Tank_Id` ORDER BY transaction.Transaction_Id");
		rs = ps.executeQuery();
		while(rs.next())
		{
			FinalTransaction transaction = new FinalTransaction();
			transaction.setId(rs.getInt("Transaction_Id"));
			transaction.setFuelname(rs.getString("Fuel_Type"));
			//transaction.setFuelid(rs.getInt("Fuel_Type_Id"));
			transaction.setFuelamount(rs.getFloat("Fuel_Amount"));
			//transaction.setPumpid(rs.getInt("Pump_Id"));
			transaction.setPumpname(rs.getString("Pump_Name"));
			//transaction.setEmpid(rs.getInt("Employee_Id"));
			transaction.setEmployeename(rs.getString("First_Name"));
			transaction.setToday(rs.getDate("Date"));
			transaction.setQuantity(rs.getFloat("Quantity"));
			transaction.setTankname(rs.getString("Tank_Name"));
			transaction.setShift(rs.getString("Shift"));
			System.out.println("Tank Name="+rs.getString("Tank_Name"));
			//transaction.setToday(rs.getDate("Date"));
			transactions.add(transaction);
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return transactions;
}
	
	
public static List<FinalTransaction> getTransactionByShift(String shift) {
	
	Connection connection = DbUtil.getCon();
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	List<FinalTransaction> transactions = new ArrayList<FinalTransaction>();
	
	try {
		ps = connection.prepareStatement("SELECT transaction.Transaction_Id , fueltype.Fuel_Type , transaction.Fuel_Amount , pump.Pump_Name , employee.First_Name , transaction.Date , transaction.Quantity ,tank.Tank_Name ,transaction.Shift  FROM TRANSACTION , fueltype , pump , employee, tank WHERE transaction.Fuel_Type_Id = fueltype.Fuel_Type_Id AND transaction.Pump_Id = pump.Pump_Id AND transaction.Employee_Id = employee.Employee_Id AND `pump`.`Tank_Id` = `Tank`.`Tank_Id` AND transaction.Shift='"+shift+"' ORDER BY transaction.Transaction_Id");
		rs = ps.executeQuery();
		while(rs.next())
		{
			FinalTransaction transaction = new FinalTransaction();
			transaction.setId(rs.getInt("Transaction_Id"));
			transaction.setFuelname(rs.getString("Fuel_Type"));
			//transaction.setFuelid(rs.getInt("Fuel_Type_Id"));
			transaction.setFuelamount(rs.getFloat("Fuel_Amount"));
			//transaction.setPumpid(rs.getInt("Pump_Id"));
			transaction.setPumpname(rs.getString("Pump_Name"));
			//transaction.setEmpid(rs.getInt("Employee_Id"));
			transaction.setEmployeename(rs.getString("First_Name"));
			transaction.setToday(rs.getDate("Date"));
			transaction.setQuantity(rs.getFloat("Quantity"));
			transaction.setTankname(rs.getString("Tank_Name"));
			transaction.setShift(rs.getString("Shift"));
			System.out.println("Tank Name="+rs.getString("Tank_Name"));
			//transaction.setToday(rs.getDate("Date"));
			transactions.add(transaction);
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return transactions;
}




public static List<FinalTransaction> getTransactionByDate(Date date , Date date1) {
	
	Connection connection = DbUtil.getCon();
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	List<FinalTransaction> transactions = new ArrayList<FinalTransaction>();
	
	try {
		ps = connection.prepareStatement("SELECT transaction.Transaction_Id , fueltype.Fuel_Type , transaction.Fuel_Amount , pump.Pump_Name , employee.First_Name , transaction.Date , transaction.Quantity ,tank.Tank_Name ,transaction.Shift  FROM TRANSACTION , fueltype , pump , employee, tank WHERE transaction.Fuel_Type_Id = fueltype.Fuel_Type_Id AND transaction.Pump_Id = pump.Pump_Id AND transaction.Employee_Id = employee.Employee_Id AND `pump`.`Tank_Id` = `Tank`.`Tank_Id` AND transaction.Date between '"+date+"' and '"+date1+"' ORDER BY transaction.Transaction_Id");
		rs = ps.executeQuery();
		while(rs.next())
		{
			FinalTransaction transaction = new FinalTransaction();
			transaction.setId(rs.getInt("Transaction_Id"));
			transaction.setFuelname(rs.getString("Fuel_Type"));
			//transaction.setFuelid(rs.getInt("Fuel_Type_Id"));
			transaction.setFuelamount(rs.getFloat("Fuel_Amount"));
			//transaction.setPumpid(rs.getInt("Pump_Id"));
			transaction.setPumpname(rs.getString("Pump_Name"));
			//transaction.setEmpid(rs.getInt("Employee_Id"));
			transaction.setEmployeename(rs.getString("First_Name"));
			transaction.setToday(rs.getDate("Date"));
			transaction.setQuantity(rs.getFloat("Quantity"));
			transaction.setTankname(rs.getString("Tank_Name"));
			transaction.setShift(rs.getString("Shift"));
			System.out.println("Tank Name="+rs.getString("Tank_Name"));
			//transaction.setToday(rs.getDate("Date"));
			transactions.add(transaction);
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return transactions;
}

}
