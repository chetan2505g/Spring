package com.chetan.constractor;

public class Person {
	private String name;
	private int personId;

	public Person(String name, int personId) {
		super();
		this.name = name;
		this.personId = personId;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", personId=" + this.personId + "]";
	}

}
