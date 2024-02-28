package com.example.zoo.domain;

public abstract class Animal {
	protected int legs;

	public Animal(int legs) {
		this.legs = legs;
	}

	public int getLegs() {
		return this.legs;
	}
	
	public void walk() {
		System.out.println(String.format("Animal with %d legs is walking now...",this.legs));
	}
	
	abstract public void eat();
}
