package com.cts.OddEven;

import java.util.List;

public class Thread2 extends Thread {

	private List<Integer> list1;

	public Thread2(List<Integer> list1) {

		// TODO Auto-generated constructor stub
		this.list1 = list1;
	}

	public void run() {
		synchronized (list1) {
			for (int j = 0; j < list1.size(); j++) {
				if (list1.get(j) % 2 != 0) {
					System.out.println(list1.get(j));
					list1.notify();
					try {
						list1.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
	}
}
