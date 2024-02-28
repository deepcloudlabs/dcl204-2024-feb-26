package com.example.zoo.application;

import java.util.List;

import com.example.zoo.domain.Animal;
import com.example.zoo.domain.Cat;
import com.example.zoo.domain.Fish;
import com.example.zoo.domain.Pet;
import com.example.zoo.domain.Spider;

public class ZooApplication {

	public static void main(String[] args) {
		List<Animal> animals = List.of(
				new Cat("Garfield"),
				new Cat(),
				new Spider(),
				new Fish("Free Willy"),
				new Spider(),
				new Fish("Nemo")
		);
		for (Animal animal : animals) {
			animal.walk();
			animal.eat();
			if (animal instanceof Pet)
			   ((Pet)animal).play();
			if (animal instanceof Pet pet)
				pet.play();
		}
	}
}
