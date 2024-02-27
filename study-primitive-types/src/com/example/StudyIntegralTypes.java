package com.example;

import java.math.BigInteger;

public class StudyIntegralTypes {

	public static void main(String[] args) {
		byte b = -128; // 1-Byte, [-128..127]
		System.out.println("b=" + b);
		b--; // b = (byte) (b - 1);
		System.out.println("b=" + b);
		System.out.println("b=" + b);
		b = 127;
		b++;
		System.out.println("b=" + b);
		short s = Short.MAX_VALUE; // 2-Byte, [-32768..32767]
		System.out.println("s=" + s);
		s++;
		System.out.println("s=" + s);
		int i = Integer.MAX_VALUE; // 4-Byte, [-2147483648..2147483647]
		System.out.println("i=" + i);
		i++;
		System.out.println("i=" + i);
		long l = Long.MAX_VALUE; // 8-Byte, [-9223372036854775808..9223372036854775807]
		System.out.println("l=" + l);
		l++;
		System.out.println("l=" + l);
		BigInteger bi = BigInteger.valueOf(2147483647); // Immutable
		System.out.println("bi=" + bi.toString());
		bi = bi.add(BigInteger.ONE);
		System.out.println("bi=" + bi.toString());
		byte x = 1, y = 127;
		byte z = (byte) (x + y);
		System.out.println("z=" + z);
		l = 12345 + 5432L;
		System.out.println("l="+l);
//		int one = 0 / 0;
//		System.out.println("one="+one);
		int inf = 1 / 0;
		System.out.println("inf="+inf);
	}

}
