package com.Model;

import java.sql.Date;

public class FinalTransaction {

	int id;
	String fuelname;
	float fuelamount;
	String pumpname;
	String employeename;
	Date today;
	String tankname;
	float quantity;
	String shift;
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getTankname() {
		return tankname;
	}
	public void setTankname(String tankname) {
		this.tankname = tankname;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFuelname() {
		return fuelname;
	}
	public void setFuelname(String fuelname) {
		this.fuelname = fuelname;
	}
	public float getFuelamount() {
		return fuelamount;
	}
	public void setFuelamount(float fuelamount) {
		this.fuelamount = fuelamount;
	}
	public String getPumpname() {
		return pumpname;
	}
	public void setPumpname(String pumpname) {
		this.pumpname = pumpname;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
}
