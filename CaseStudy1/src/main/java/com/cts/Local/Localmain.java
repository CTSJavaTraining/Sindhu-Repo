package com.cts.Local;

public class Localmain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TransactionID id = new TransactionID();
		Thread t1 = new Thread(id);
		Thread t2 = new Thread(id);
		t1.start();
		t1.join();
		t2.start();

	}

}
