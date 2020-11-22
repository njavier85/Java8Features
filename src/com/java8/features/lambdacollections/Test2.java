package com.java8.features.lambdacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {

		/*
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		
		System.out.println(l);
		Collections.sort(l, (I1,I2)-> (I1>I2)?-1:(I1<I2)?1:0);
		System.out.println(l);*/
		
/*
		TreeSet<Integer> t = new TreeSet<Integer>( (I1,I2)-> (I1>I2)?-1:(I1<I2)?1:0  );
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(25);
		System.out.println(t);*/
		
		/*
		TreeMap<Integer,String> m = new TreeMap<Integer,String>((I1,I2)-> (I1>I2)?-1:(I1<I2)?1:0 );
		m.put(100,"Durga");
		m.put(600,"Sunny");
		m.put(300,"Bunny");
		m.put(200,"Chinny");
		m.put(700,"Vinny");
		m.put(400,"Pinny");
		System.out.println(m);*/
		
		
		Employee e11= new Employee(100,"Durga");
		
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(200,"Deepika"));
		l.add(new Employee(400,"Sunny"));
		l.add(new Employee(300,"Mallika"));
		l.add(new Employee(100,"Katrina"));
		
		System.out.println("Before Sorting"+l);
		
		
		Collections.sort(l, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		
		System.out.println("After Sorting"+l);

	}

}
