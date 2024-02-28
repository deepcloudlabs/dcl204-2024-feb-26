package com.example;

import java.math.BigDecimal;

public class StudyFloatPointTypes {

	public static void main(String[] args) {
		// IEEE-754
		float x = 3.141516171819F; // 4-Byte
		double y = 123.56; // 8-byte
		y = 2.0;
		y = y - 1.10;
		System.out.println("y="+y);
        y = 4.35;
        y = 100.0 * y;
        System.out.println("y="+y);
        x = 1_000_000_000;
        x = x + 50;
        System.out.println(String.format("x=%16.3f",x));
        // BigDecimal -> immutable
        BigDecimal money = BigDecimal.valueOf(2.0);
        money = money.subtract(BigDecimal.valueOf(1.1));
        System.out.println(money);
		double one = 0. / 0;
		System.out.println("one="+one);
		double inf = 1. / -0.;
		System.out.println("inf="+inf);   
		one++;
		System.out.println("one="+one);
		System.out.println("one==NaN? "+(one==Double.NaN));
		System.out.println("one==one: "+(one==one));
		System.out.println("one==NaN: "+Double.isNaN(one));
		
	}

}
