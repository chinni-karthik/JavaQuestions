package com.ck.threads;

//Note : The thread that wants to wait has to call join(), on the thread object that it is ready to wait for. 
//Very simple. Did not know why you got confused...!!!
public class YieldDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyThreadYealdDemo();
		t.start();
		t.join();//Rama has to wait until sita completes her execution. Hence, rama called join() on sita Thread.
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama Thread");
		}
	}
}

class MyThreadYealdDemo extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println("Sita Thread");
		}
	}
}