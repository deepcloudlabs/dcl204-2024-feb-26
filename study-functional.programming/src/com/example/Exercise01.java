package com.example;

import java.util.List;

public class Exercise01 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 8, 15, 16, 23, 42);
		int solution = 0;
		for (int number : numbers) {
			if (number % 2 == 1) {
				int cubed = number * number * number;
				solution += cubed;
			}
		}
		System.out.println(solution); // 15542

	}

}
