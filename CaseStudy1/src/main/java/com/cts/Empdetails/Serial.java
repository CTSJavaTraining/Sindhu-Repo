package com.cts.Empdetails;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String args[]) throws Exception {
		//TODO: proper variable name
		Employee e1 = new Employee(211, "ravi");

		FileOutputStream fout = new FileOutputStream("D:\\serial.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(e1);
		out.flush();

	}
}
