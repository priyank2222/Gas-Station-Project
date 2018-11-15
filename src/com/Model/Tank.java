package com.Model;

public class Tank {

	int id;
	String tankname;
	int fuelid;
	float fuelbalance;
	
	public float getFuelbalance() {
		return fuelbalance;
	}
	public void setFuelbalance(float fuelbalance) {
		this.fuelbalance = fuelbalance;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTankname() {
		return tankname;
	}
	public void setTankname(String tankname) {
		this.tankname = tankname;
	}
	public int getFuelid() {
		return fuelid;
	}
	public void setFuelid(int fuelid) {
		this.fuelid = fuelid;
	}
	}
