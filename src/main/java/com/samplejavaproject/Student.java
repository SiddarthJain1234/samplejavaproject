package com.samplejavaproject;

//import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollno;
	
 //dependencies injection
//	private Human h;
//	private School s;
//	private Bus b;
//	
	
	


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + "]";
	}


	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
//	public Human getH() {
//		return h;
//	}
//	public void setH(Human h) {
//		this.h = h;
//	}
//	public School getS() {
//		return s;
//	}
//	public void setS(School s) {
//		this.s = s;
//	}
//	public Bus getB() {
//		return b;
//	}
//	public void setB(Bus b) {
//		this.b = b;
//	}
	
	public void start() {
		System.out.println("initialzied");
	}
	
	public void stop() {
		System.out.println("destroyed");
	}
	
	public void testMethod() {
		System.out.println("hello tested this mehtod");
	}
	
	
	
	
	
}
