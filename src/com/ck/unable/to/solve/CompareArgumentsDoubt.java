package com.ck.unable.to.solve;

import java.util.Comparator;

public class CompareArgumentsDoubt implements Comparable<CompareArgumentsDoubt> {

	@Override
	public int compareTo(CompareArgumentsDoubt o) {
		//Argument should be the argument mentioned as generic to Comparable
		return 0;
	}

}

class MyComparator implements Comparator<MyComparator>{

	@Override
	public int compare(MyComparator obj1, MyComparator obj2) {
		//Argument should be the argument mentioned as generic to Comparator
		return 0;
	}
	
}

class MyComparator2 implements Comparator<MyComparator>{

	@Override
	public int compare(MyComparator obj1, MyComparator obj2) {
		//So, we can have multiple comparators for a single object.
		return 0;
	}
	
}
