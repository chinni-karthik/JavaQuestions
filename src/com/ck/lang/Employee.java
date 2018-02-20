package com.ck.lang;

//Hashcode and equals contract==>> two equivalant objects should always be having same hashcode.
//This means, if obj1.equals(obj2), then obj1.hashCode() and obj2.hashCode() should be same.
//Remember this as, in a hashset, bucket may contain various objects, but all those objects need not be equal.
//But, if two objects are equal, they should be always in same bucket...!!!
//Note: if equals is overridden, then hashCode must be overridden to satisfy above contract. 
public class Employee {
	int eid;
	String ename;
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public int hashCode() {
		return eid+ename.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if (eid == other.eid && ename.equals(other.ename))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
}
