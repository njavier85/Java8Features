package com.java8.features.defaultandstaticmethods;

public class Test2 implements Left,Right{

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1();

	}

	
	public void m1() {
		//System.out.println("My own implementation");
		//Left.super.m1();
		Right.super.m1();
	}

}
