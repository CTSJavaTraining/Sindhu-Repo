package com.cts.ProducerConsumer;

import java.util.LinkedList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> Queue = new LinkedList<Integer>();
		Producer producer = new Producer(Queue);
		Consumer consumer = new Consumer(Queue);
		Thread ProducerThread = new Thread(producer);
		Thread ConsumerThread = new Thread(consumer);
		ProducerThread.start();
		ConsumerThread.start();
	}
}
