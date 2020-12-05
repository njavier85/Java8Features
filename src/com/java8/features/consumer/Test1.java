package com.java8.features.consumer;

import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = s-> System.out.println(s);
		
		c.accept("Hello");
		c.accept("DURGASOFT");
	}

}
