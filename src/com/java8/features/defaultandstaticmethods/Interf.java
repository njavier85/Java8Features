package com.java8.features.defaultandstaticmethods;

public interface Interf {

	public static final int x=10;
	
	default void m1() {
		System.out.println("Default Method");
	}
	
}
