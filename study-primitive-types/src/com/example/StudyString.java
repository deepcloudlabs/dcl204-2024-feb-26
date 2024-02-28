package com.example;

@SuppressWarnings("unused")
public class StudyString {

	public static void main(String[] args) {
		// new -> Heap -> Garbage Collector
		// immutable
		String name1 = new String("jack"); // Heap
		String name2 = "jack"; // Constant Pool/Object Pool
		String name3 = "jack2";
		String name4 = "jack"; 
		
		System.out.println("name1 == name2: "+(name1==name2));
		System.out.println("name3 == name2: "+(name3==name2));
		name2 = name2.toUpperCase();
		System.out.println(name2);

	}

}
