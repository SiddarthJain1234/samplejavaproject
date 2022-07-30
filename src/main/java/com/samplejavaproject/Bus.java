package com.samplejavaproject;

public class Bus {

	private int busNo;
	private int routeNo;
	private String driverName;
	private String driverContactNo;
	
	
	
	
	public Bus(int busNo, int routeNo, String driverName, String driverContactNo) {
		super();
		this.busNo = busNo;
		this.routeNo = routeNo;
		this.driverName = driverName;
		this.driverContactNo = driverContactNo;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", routeNo=" + routeNo + ", driverName=" + driverName + ", driverContactNo="
				+ driverContactNo + "]";
	}
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public int getRouteNo() {
		return routeNo;
	}
	public void setRouteNo(int routeNo) {
		this.routeNo = routeNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverContactNo() {
		return driverContactNo;
	}
	public void setDriverContactNo(String driverContactNo) {
		this.driverContactNo = driverContactNo;
	}
	
	
	
	
	
}
