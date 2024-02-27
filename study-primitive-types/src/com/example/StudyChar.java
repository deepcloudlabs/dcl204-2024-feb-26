package com.example;

public class StudyChar {

	public static void main(String[] args) {
		char c = 'x'; // unsigned int, 2-byte, unicode encoded
		System.out.println("c: "+c);
		System.out.println("c: "+(int)c);
		System.out.println("c: "+(c+1));
		System.out.println("c: "+(char)(c+1));
		char y = '\u20ba'; //
		// \ud834\udd1e 
		System.out.println(y);
		String p = "\u20ba\u20ba\u20ba\u20ba";
		System.out.println(p.hashCode());
	}

}
