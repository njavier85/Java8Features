package com.java8.features.functions;

import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String,Integer> f = s-> s.length();
		System.out.println(f.apply("Durga"));
		System.out.println(f.apply("durgasoft"));
		
		
		Function<Integer,Integer> f1 = i->i*i;
		System.out.println(f1.apply(5));
		System.out.println(f1.apply(10));
		
		
		
		
		
		
	}

}
