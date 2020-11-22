package com.java8.features.lambdaexpresion;

@FunctionalInterface
public interface Interf {

	public void m1();
	
	public default void m2() {
		System.out.println("Hello");
	}
	
	public static void m3() {
		
	}
}
