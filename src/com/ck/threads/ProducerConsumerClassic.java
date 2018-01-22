package com.ck.threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerClassic {

	static List<Integer> list = new ArrayList<Integer>();// Common object for both producer and consumer

	static class Producer implements Runnable {// Static inner class

		List<Integer> list;

		/**
		 * If List is empty, add items to list , notify the waiting Consumer Thread and sleep for some time!
		 */
		public Producer(List<Integer> list) {
			this.list = list;
		}

		@Override
		public void run() {
			synchronized (list) {
				for (int i = 0; i < 10; i++) {
					if (list.size() >= 1) {
						try {
							System.out.println("producer is waiting ");
							list.wait();
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}
					}

					System.out.println("produce=" + i);
					list.add(i);
					list.notifyAll();
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * If list is not empty, remove from list , notify the producer and sleep for some time!
	 *
	 */
	static class Consumer implements Runnable {

		List<Integer> list;

		public Consumer(List<Integer> list) {
			this.list = list;
		}

		@Override
		public void run() {
			synchronized (list) {
				for (int i = 0; i < 10; i++) {
					while (list.isEmpty()) {
						System.out.println("Consumer is waiting");
						try {
							list.wait();
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}
					}

					int k = list.remove(0);
					System.out.println("consume=" + k);
					list.notifyAll();
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread producer = new Thread(new Producer(list));
		Thread consumer = new Thread(new Consumer(list));
		producer.start();
		consumer.start();

	}
}