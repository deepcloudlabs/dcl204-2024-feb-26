package com.example;

import java.util.HashMap;
import java.util.Map;

public class StudyMap {

	public static void main(String[] args) {
		// Associative Collection
		Map<String,Integer> areaCodes = new HashMap<>();
		areaCodes.put("ankara", 312);
		areaCodes.put("istanbul-avrupa", 212);
		areaCodes.put("istanbul-anadolu", 216);
		System.out.println(areaCodes.get("ankara"));

	}

}
