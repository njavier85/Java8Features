package com.java8.features.functions;

import java.util.function.Function;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String,String> f1 = s->s.toUpperCase();
		Function<String, String> f2 = s->s.substring(0, 9);
		
		System.out.println(f1.apply("Aishwaryaabhi"));
		System.out.println(f2.apply("Aishwaryaabhi"));
		
		System.out.println(f1.andThen(f2).apply("Aishwaryaabhi"));
		System.out.println(f1.compose(f2).apply("Aishwaryaabhi"));
		
		/**********************************************/
		
		Function<Integer,Integer> f3 = i->i+i;
		Function<Integer,Integer> f4 = i->i*i*i;
		
		System.out.println(f3.andThen(f4).apply(2)); //4 --> 4*4*4=64
		System.out.println(f3.compose(f4).apply(2)); //8 --> 8+8 =16
		
		
		
	}

}
