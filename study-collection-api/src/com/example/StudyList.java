package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudyList {

	public static void main(String[] args) {
		// 1. Allows duplicate 2. Ordered -> Sortable
		// Implementations: ArrayList, LinkedList
		List<Integer> numbers = new ArrayList<>();
		numbers.add(42);
		numbers.add(4);
		numbers.add(15);
		numbers.add(23);
		numbers.add(8);
		numbers.add(16);
		numbers.add(8);
		numbers.add(15);
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println(numbers.get(3));
		System.out.println(numbers.get(0));
		numbers.add(3, 108);
		System.out.println(numbers);
		numbers.remove(0);
		System.out.println(numbers);
		Comparator<Integer> numericOrderAsc = 
				(x,y) -> x-y; // function
		numbers.sort(numericOrderAsc); // higher-order function
		System.out.println(numbers);
		numbers.sort(numericOrderAsc.reversed());
		System.out.println(numbers);
		
	}

}
