package com.cts.Empdetails;

class CloneEmployee extends Object implements Cloneable {

	private int rollno;
	private String name;

	/**
	 * constructor with (integer,string) arguments
	 * 
	 * @param rollno
	 * @param name
	 */
	CloneEmployee(int rollno, String name) {
		this.setRollno(rollno);
		this.setName(name);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * 
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * rollno to be set
	 * 
	 * @param rollno
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * the name to be set
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
