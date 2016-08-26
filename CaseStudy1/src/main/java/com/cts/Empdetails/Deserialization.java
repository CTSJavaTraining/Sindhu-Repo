package com.cts.Empdetails;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * De-serialization is explained
 * 
 * @author 542224
 *
 */
public class Deserialization {
	/**
	 * object is reconstructed from sequence of bytes
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\serial.txt"));
		SerialDeserial e1 = (SerialDeserial) in.readObject();
		System.out.println(e1.getId() + " " + e1.getName());

		in.close();
	}
}
