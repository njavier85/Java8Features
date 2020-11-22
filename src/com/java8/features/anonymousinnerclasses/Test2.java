package com.java8.features.anonymousinnerclasses;

import com.java8.features.lambdaexpresion.Interf;

public class Test2 {

	int x=888;
	
	public static void main(String[] args) {

		Test2 test2 = new Test2();
		test2.m2();
	}
	
	public void m2() {
		Interf i =new Interf() {

			int x=999;// instance variable
			
			@Override
			public void m1() {

				System.out.println(this.x); //999
			}
			
		};
		
		i.m1();
	}

}
