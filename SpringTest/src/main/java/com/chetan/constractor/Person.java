package com.chetan.constractor;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private List<String> certi;
	

	public Person(String name, int personId, List<String> certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", personId=" + this.personId +" Certificate: "+ this.certi + "]" ;
	}

}
