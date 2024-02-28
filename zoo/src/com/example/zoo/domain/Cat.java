package com.example.zoo.domain;

public class Cat extends Animal implements Pet {
	private String name;

	public Cat() {
		super(4);
		this.name = "Tekir";
	}

	public Cat(String name) {
		super(4);
		this.name = name;
	}

}
