package com.cts.Empdetails;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeseri {
	public static void main(String args[]) throws Exception {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\serial.txt"));
		Employee e1 = (Employee) in.readObject();
		//TODO:USe getter setter
		System.out.println(e1.getId() + " " + e1.getName());

		in.close();
	}
}
