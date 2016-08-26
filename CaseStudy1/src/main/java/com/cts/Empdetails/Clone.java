package com.cts.Empdetails;

/**
 * Creating object using clone
 * 
 * @author 542224
 *
 */
public class Clone {
	/**
	 * employee object is created
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			CloneEmployee emp1 = new CloneEmployee(101, "amit");

			CloneEmployee emp2 = (CloneEmployee) emp1.clone();

			System.out.println(emp1.getRollno() + " " + emp1.getName());
			System.out.println(emp2.getRollno() + " " + emp2.getName());

		} catch (CloneNotSupportedException c) {
		}

	}

}
