package com.example;

import java.util.Set;
import java.util.TreeSet;

public class StudySet {

	public static void main(String[] args) {
		// Linear Collection		
		// 1. Unique 2. Unordered -> Not Sortable
		// Implementations: HashSet, LinkedHashSet, TreeSet
		Set<Integer> numbers = new TreeSet<>((x,y)->y-x);
		numbers.add(42);
		numbers.add(4);
		numbers.add(15);
		numbers.add(23);
		numbers.add(8);
		numbers.add(16);
		numbers.add(8);
		numbers.add(15);
		System.out.println(numbers);
		numbers.remove(8);
		numbers.contains(108);		
		System.out.println(numbers);
		
	}

}
