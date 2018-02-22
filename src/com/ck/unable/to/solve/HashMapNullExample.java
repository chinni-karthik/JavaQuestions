package com.ck.unable.to.solve;

import java.util.HashMap;

public class HashMapNullExample {
	public static void main(String[] args) {
		HashMap<Employee, String> map = new HashMap<>();
		map.put(new Employee(1, "Karthik"), "one");
		map.put(new Employee(2, "Venkat"), "two");
		map.put(new Employee(3, "Mukesh"), "Three");
		map.put(new Employee(4, "Annavaram"), "four");
		
		System.out.println(map.size());//Size is 1. as all the above a equal as equals() and hashCode() are overridden.
		
		map.put(null, "five");
		map.put(null, "six");

		System.out.println(map.size());//Size is 2
		//inserting null is not a special case. It is the same as inserting any other value.
		//as duplicate keys are not allowed, and if duplicate keys are inserted, the values will be replaced.
		//same is the case with null as well...!!!

	}
}

class Employee {
	int eid;
	String eName;

	public Employee(int eid, String eName) {
		super();
		this.eid = eid;
		this.eName = eName;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
