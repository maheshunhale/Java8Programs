package com.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> p = (a,b) -> (a*b)%2 == 0;
		
		System.out.println("p.test(1,1): "+p.test(1, 1));
		
		System.out.println("p.test(1,2): "+p.test(1, 2));
		
		System.out.println("p.test(1,3): "+p.test(1, 3));
		
		System.out.println("p.test(1,4): "+p.test(1, 4));
		
	}

}
