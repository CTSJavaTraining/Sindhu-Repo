package com.cts.OddEven;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
	public static void main(String args[]) throws InterruptedException {
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list1.add(i);
			// System.out.println(list1);
		}
		Thread1 t1 = new Thread1(list1);
		Thread2 t2 = new Thread2(list1);
		t1.start();
		t2.start();
	
	}
}