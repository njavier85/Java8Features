package com.java8.features.predicate;

import java.util.function.Predicate;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> p = Predicate.isEqual("DURGASOFT");
		//System.out.println(p.test("DURGASOFT"));
		//System.out.println(p.test("MALLIKA"));
		
		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Durga","CEO",30000,"Hyderabad"));
		
		Employee e1= new Employee("Durga","CEO",30000,"Hyderabad");
		Employee e2 =new Employee("Sunny","Manager",20000,"Hyderabad");
		
		System.out.println(isCEO.test(e1));
		System.out.println(isCEO.test(e2));
		
	}

}
