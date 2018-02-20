package com.ck.lang;

import java.util.HashMap;

public class HashCodeEqualsTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Karthik");
		Employee emp2 = new Employee(100, "Karthik");
		System.out.println(emp1.equals(emp2));//true
		System.out.println(emp1.hashCode());//729167542
		System.out.println(emp2.hashCode());//729167542
		
		HashMap<Employee,Integer> hashMap=new HashMap<>();
		hashMap.put(emp1, 1);
		hashMap.put(emp2, 2);
		hashMap.put(emp2, 1000);
		
		System.out.println(hashMap.size());//1
		System.out.println(hashMap.get(new Employee(100, "Karthik")));//1000 Note: gets the most recently added object.

	}
}
