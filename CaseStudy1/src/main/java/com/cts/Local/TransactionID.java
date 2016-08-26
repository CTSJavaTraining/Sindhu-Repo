package com.cts.Local;

public class TransactionID implements Runnable {

	private ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();

	public void run() {
		threadlocal.set((int) (Math.random() * 1000D));
		System.out.println(Thread.currentThread().getName() + "\nID:" + threadlocal.get());

	}

}
