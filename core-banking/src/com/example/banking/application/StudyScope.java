package com.example.banking.application;

public class StudyScope {

	public static void main(String[] args) { // method block
		String name;
		for (int i=0;i<10;++i) { // for-block
			name = "jack";
			int sum = 0;
			for (int j=0;j<5;j++) { // in-most block
				int total = 0; // local, value-typed
				sum = sum + j;
				total = total + i + j;
				name = name + total;
			}
			// total ? wrong
			// name ? correct
		}
		// name ? correct
		// sum ? wrong
		// total ? wrong
	}

}
