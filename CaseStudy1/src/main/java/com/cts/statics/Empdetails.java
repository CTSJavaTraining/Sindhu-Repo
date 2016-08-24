package com.cts.statics;

import java.util.Scanner;

public class Empdetails {
	
	private static int count = 0;
	private int rollno;
	private String name;

	Empdetails() {
		count++;
	}

	/**
	 * 
	 * @param r
	 * @param n
	 */

	Empdetails(int r, String n) {
		this();
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name);

	}

	static {
		System.out.println("program starts");
	}

	/**
	 * 
	 * @param id
	 */
	static void validate(String id) {
		String EMAIL_PATTERN = "abcd@gmail.com";
		if (EMAIL_PATTERN.matches(id)) {
			System.out.println("Email ID is valid");
		} else {
			System.out.println("Email ID is invalid");
		}

	}

	public static void main(String[] args) {
		Empdetails e2 = new Empdetails(111, "Karan");
		Empdetails e3 = new Empdetails(222, "Aryan");
		e2.display();
		e3.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String id = sc.nextLine();
		Empdetails.validate(id);
		System.out.println("The number of employees " + count);
	}

}
