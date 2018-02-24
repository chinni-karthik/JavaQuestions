package com.ck.unable.to.solve;

public class TwoThreadsCalculatingOneExpression {
	/*
	Expression to calculate:
	(1+2)/(1*2)
	t1-->(1+2)
	t2-->(1*2)
	t3-->(t1.value/t2.value)
	*/
	public static void main(String[] args) throws InterruptedException {
		Add t1=new Add();
		Mul t2=new Mul();
		t1.start();
		t2.start();
		//By this time, add and mul would have been computed by two threads.
		//Making main thread wait until t1 and t2 are completed.
		t1.join();
		t2.join();
		//Printed by main thread...!!!
		System.out.println(t1.value/t2.value);
	}
}
class Add extends Thread{
	int value;
	@Override
	public void run(){
		value= 1+2;
	}
}
class Mul extends Thread{
	int value;
	@Override
	public void run(){
		value= 1*2;
	}
}