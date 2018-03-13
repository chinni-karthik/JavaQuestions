package com.ck.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {

}

// writing a Counter class:
class Counter {
	private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}

}

// Making it synchronized

class SynchronizedCounter {
	private int c = 0;

	public synchronized void increment() {
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

	public synchronized int value() {
		return c;
	}

}

// Why unnecessaryly making the whole method synchronized??
// Use atomic variables instead

class AtomicCounter {
	private AtomicInteger c = new AtomicInteger(0);

	public void increment() {
		c.incrementAndGet();
	}

	public void decrement() {
		c.decrementAndGet();
	}

	public int value() {
		return c.get();
	}

}