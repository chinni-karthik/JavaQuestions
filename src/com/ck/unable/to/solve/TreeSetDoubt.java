package com.ck.unable.to.solve;

import java.util.TreeMap;

/*
1-Only comparable should be overridden while using TreeMap or TreeSet
2-TreeSet internally used TreeMap
3-if any user defined object is to be stored in TreeSet or TreeMap, we need to implement Comparable and NOT Comparator
4-if compareTo() is returning 0, it means, the value we are about to insert is same as the previous and hence, the size is 0 in the above example
5-if compareTo() is returning +ve, then insertion order is maintained and size is 4.
5-if compareTo() is returning -ve, then insertion order is maintained in reverse way and size is 4.
*/

public class TreeSetDoubt {
	public static void main(String[] args) {
		TreeMap<Person,String> ts=new TreeMap<Person,String>();
		ts.put(new Person(1,"Karthik"),"One");
		ts.put(new Person(1,"Venkat"),"Two");
		ts.put(new Person(1,"Mukesh"),"Three");
		ts.put(new Person(1,"Annavaram"),"Four");
		System.out.println(ts.size());
		System.out.println(ts);
		
	}
}

class Person implements Comparable<Person> {
	int pid;
	String pName;

	public Person(int pid, String pName) {
		super();
		this.pid = pid;
		this.pName = pName;
	}

	@Override
	public int compareTo(Person obj1) {
		return -1;
	}
}