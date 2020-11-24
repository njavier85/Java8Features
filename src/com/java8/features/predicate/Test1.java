package com.java8.features.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Predicate<Integer> p =I->I>10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));*/
		
		
		/*
		Predicate<String> p1= s-> s.length()>5;
		System.out.println(p1.test("abcdef"));
		System.out.println(p1.test("abc"));*/
		
		Predicate<Collection> p2 = c->c.isEmpty();
		ArrayList l1= new ArrayList();
		l1.add("A");
		System.out.println(p2.test(l1));
		
		
		ArrayList l2 = new ArrayList();
		System.out.println(p2.test(l2));
		
	}
	
}
