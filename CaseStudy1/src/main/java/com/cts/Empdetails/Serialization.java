package com.cts.Empdetails;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Serialization is explained
 * 
 * @author 542224
 *
 */
public class Serialization {
	/**
	 * object is converted into byte stream
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		// TODO: proper variable name
		SerialDeserial emp = new SerialDeserial(211, "ravi");

		FileOutputStream fout = new FileOutputStream("D:\\serial.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(emp);
		out.flush();

	}
}
