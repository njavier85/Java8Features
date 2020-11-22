package com.java8.features.anonymousinnerclasses;

import com.java8.features.lambdaexpresion.Interf;

public class Test3 {

	int x = 888;
	
	public static void main(String[] args) {

		Test3 t = new Test3();
		t.m2();
	}
	
	public void m2() {
		Interf i = ()->{
			 int x = 999;
			 System.out.println(this.x); //888
		};
		
		i.m1();
	}

}
