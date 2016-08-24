package com.cts.reflect;

public class Reflection {
	private String name = "John";
	private int age = 23;
	private Integer sal = new Integer(5000);
	private Double incentive = new Double("12345.567");
	private boolean isEmployee = true;

	/**
	 * 
	 * @param s
	 */
	void display(String s) {
		System.out.println("name=" + name);
		System.out.println("age=" + age);
		System.out.println("sal=" + sal);
		System.out.println("incentive=" + incentive);
		System.out.println("isemployee=" + isEmployee);
	}
}
