package com.ck.unable.to.solve;

public class PQandBQnotes {
	// Priority queue is used to remove the element from a normal queue based on priority.
	// If same priority , then FIFO is followed.
	// in the constructor , you initialize a Comparator that decides the way that the elements are to be inserted.
	// used in Dijkstra's and prim's algorithms.
	// Three pQ are used for a elevaror problem.
	
	// Blocking queue is a queue that is used on case of concurrency.
	// it is a normal queue with below additional properties.
	// 1-it waits if the queue to fill if it is empty.
	// 2-it waits if the queue to have empty space if it is full.
	// q.put() and q.take() are used instead of wait() and notify() in PandC problem.
	
}
