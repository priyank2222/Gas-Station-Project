package com.Model;

import java.sql.Date;

public class Transaction {

	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	int id;
	int fuelid;
	float fuelamount;
	int pumpid;
	int empid;
	Date today;
	String shift;
	
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFuelid() {
		return fuelid;
	}
	public void setFuelid(int fuelid) {
		this.fuelid = fuelid;
	}
	public float getFuelamount() {
		return fuelamount;
	}
	public void setFuelamount(float fuelamount) {
		this.fuelamount = fuelamount;
	}
	public int getPumpid() {
		return pumpid;
	}
	public void setPumpid(int pumpid) {
		this.pumpid = pumpid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	
	
}
