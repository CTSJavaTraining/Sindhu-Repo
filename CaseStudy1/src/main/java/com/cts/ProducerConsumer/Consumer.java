package com.cts.ProducerConsumer;

import java.util.List;

public class Consumer implements Runnable {
	private List<Integer> Queue;

	public Consumer(List<Integer> Queue) {
		// TODO Auto-generated constructor stub
		this.Queue = Queue;
	}

	public void run() {
		try {
			while (true)
				consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void consume() throws InterruptedException {
		synchronized (Queue) {
			if (Queue.size() == 0) {
				System.out.println("No products to be consumed");
				Queue.wait();
			}

			else {
				int remove = Queue.remove(0);
				System.out.println("Consumed" + remove);
				Queue.notify();
			}

		}
	}
}
