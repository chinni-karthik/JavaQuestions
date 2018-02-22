package com.ck.unable.to.solve;

/*
 * The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
 * The class is final so we cannot create the subclass.
 * There is no setter methods i.e. we have no option to change the value of the instance variable.
 */

public final class ImmutableStudent {//Final class, hence we cannot extend it.

	private final int id;//final variable, hence we cannot modify it.
	private final String name;//final variable, hence we cannot modify it.

	public ImmutableStudent(int id, String name) {
		this.name = name;
		this.id = id;
	}

	//Only getters and no setters...!!!
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}