package com.ck.unable.to.solve;

public class RunnableVsCallable {
	//The Callable interface is similar to Runnable, in that both are designed for classes whose instances are potentially executed by another thread. 
	//A Runnable, however, does not return a result and cannot throw a checked exception.
	
	//Why Runnable if Callable can do everything that Runnable does?
	//As Runnable was introduced in java 1.0 and Callable in 1.5, to support above features that were missed in Runnable.
	//if any change to run() signature is made, backward compatibility would be lost.
	
	//The calling thread will be blocked until the future comes back with results. i.e. unitl call() method execution is completed.
	//Here, Executor.submit(Callable) will submit the callable task and the call to call() is made internally.
	//future.get() or future.get(timeout) is a blocking method as it waits unitl future is returned with the computation result of call().
	//timeout is mentioned as there may be a chance to occur dead lock.
	
	//Good to read...!!!
	//https://www.coderanch.com/wiki/659807/Thread-Pools
}
