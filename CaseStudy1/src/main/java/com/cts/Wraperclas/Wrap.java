package com.cts.Wraperclas;

public class Wrap {

	public static void main(String[] args) {
		String s1 = "100";
		int i = Integer.parseInt(s1);
		// System.out.println(i);
		Integer n1 = Integer.valueOf(i);
		//System.out.println(n1);
		int n2 = n1.intValue();
		System.out.println(n2);
	}

}
