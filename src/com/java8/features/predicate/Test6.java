package com.java8.features.predicate;

import java.util.function.Predicate;

public class Test6 {

	public static void main(String[] args) {

		SoftwareEngineer[] list= {
			new SoftwareEngineer("Durga",60,false),
			new SoftwareEngineer("Sunil",25,true),
			new SoftwareEngineer("Sayan",26,true),
			new SoftwareEngineer("Sabbir",28,false),
			new SoftwareEngineer("Ravi",17,true)
		};
		
		Predicate<SoftwareEngineer> allowed = se->se.age>=18 && se.isHavingGF;		
	
		System.out.println("The Allowed Members into Pub are:");
		for(SoftwareEngineer se:list) {
			if(allowed.test(se)) {
				System.out.println(se);
			}
		}
	}

}
