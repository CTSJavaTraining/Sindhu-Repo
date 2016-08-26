package com.cts.ProducerConsumer;

import java.util.List;

public class Producer implements Runnable {
	private List<Integer> Queue;
	int maxSize = 2;

	public Producer(List<Integer> Queue) {
		// TODO Auto-generated constructor stub
		this.Queue = Queue;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void produce(int i) throws InterruptedException {

		synchronized (Queue) {
			if (Queue.size() == maxSize) {

				System.out.println("Producer waits till consumer consumes" + "MaxSize=" + Queue.size());
				Queue.wait();
			}

			else {
				Queue.add(i);
				System.out.println("produced" + i);
				Queue.notify();
			}

		}
	}
}
