package com.java8.features.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*increment salary<3500*/
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		System.out.println("Before Increment: "+l);
		
		Predicate<Employee> p = e->e.salary<3500;
			
		Function<Employee,Employee> f =e->{
			e.salary= e.salary+477;
			return e;
		};
		
		ArrayList<Employee> l2 = new ArrayList<Employee>();
		for(Employee e:l) {
			if(p.test(e)) {
				l2.add(f.apply(e));
			}
		}
		
		System.out.println("After Increment: "+l);
		System.out.println("Employees who salary is increment: "+l2);
	}

	
	private static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Sunny",1000));
		l.add(new Employee("Bunny",2000));
		l.add(new Employee("Chinny",3000));
		l.add(new Employee("Pinny",4000));
		l.add(new Employee("Vinny",5000));
		l.add(new Employee("Durga",1000));

	}
}
