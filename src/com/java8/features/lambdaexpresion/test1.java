package com.java8.features.lambdaexpresion;

public class test1 {

	public static void main(String[] args) {
		/*
		Interf f = ()->{System.out.println("Hello");};
		f.m1();*/
		
		/*
		Interf2 i = (a,b)->System.out.println("The sum: "+(a+b));
		i.add(10, 20);
		i.add(100, 200);*/
		
		/*
		Interf3 i = s->s.length();
 	    System.out.println(i.getLength("Hello"));
 	    System.out.println(i.getLength("With Lambda Expression"));*/
		
		/*
		Interf4 i = x->x*x;
		System.out.println(i.square(10));
		System.out.println(i.square(20));*/
		
		
		Runnable r = ()->{
			for(int i =0;i<10;i++) {
				System.out.println("Child Threa");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i =0;i<10;i++) {
			System.out.println("Main Thread"); 
		}
		
		

	}

}
