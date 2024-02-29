package com.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Exercise02 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 8, 15, 16, 23, 42);
		// Collection -> Stream: MapReduce Framework
		// Functional Programming: i) High-Order Function (HoF) ii) Pure Function
		Predicate<Integer> isOdd = t -> t%2 == 1;   
		ToIntFunction<Integer> toCubed = x -> x*x*x;
		int solution = numbers.stream()
						      .parallel()
				              .filter(isOdd) // HoF
				              .mapToInt(toCubed)
				              .sum();
		System.out.println(solution); // 15542

	}

}
