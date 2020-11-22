package com.java8.features.defaultandstaticmethods;

public class Test3 implements Interf2{

	public static void main(String[] args) {
		Test3 t = new Test3();
		//t.m1();
		
		//Test3.m1();
		Interf2.m1(); //the only way it works
	}
	
}
