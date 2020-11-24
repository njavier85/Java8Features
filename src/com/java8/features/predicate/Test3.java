package com.java8.features.predicate;

import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Sunny","Kajal","Malika","Katrina","Kareena"};
		
		
		Predicate<String> startWithK = s-> s.charAt(0)=='K';
		
		for(String s: name) {
			if(startWithK.test(s)) {
				System.out.println(s);
			}
		}
		
		
	}

}
