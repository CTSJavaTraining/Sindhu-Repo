package com.cts.Empdetails;

class Emp extends Object implements Cloneable {
	//TODO:Access modifers
	private int rollno;
	private String name;

	Emp(int rollno, String name) {
		this.setRollno(rollno);
		this.setName(name);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
