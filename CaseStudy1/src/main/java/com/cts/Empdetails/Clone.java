package com.cts.Empdetails;

public class Clone {
	public static void main(String args[]) {
		try {
			Emp e1 = new Emp(101, "amit");

			Emp e2 = (Emp) e1.clone();

			System.out.println(e1.getRollno() + " " + e1.getName());
			System.out.println(e2.getRollno() + " " + e2.getName());

		} catch (CloneNotSupportedException c) {
		}

	}

}
