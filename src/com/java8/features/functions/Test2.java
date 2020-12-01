package com.java8.features.functions;

import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="Durga Software Solutions Hyderabad";
		
		Function<String, String> f = s->s.replaceAll(" ", "");
		System.out.println(f.apply(s1));
		
		Function<String,Integer> f1 = s-> s.length()- s.replaceAll(" ", "").length(); 
		System.out.println(f1.apply(s1));
		
	}

}
