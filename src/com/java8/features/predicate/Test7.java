package com.java8.features.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);

		
		Predicate<Employee> p1 = emp->emp.designation.equals("Manager");
		System.out.println("Manager Information:");
		display(p1,list);
		
		Predicate<Employee> p2= emp->emp.city.equals("Bangalore");
		System.out.println("Bangalore Employee Information:");
		display(p2,list);
		
		
		Predicate<Employee> p3 = emp->emp.salary<20000;
		System.out.println("All Employees Information whose salary < 20000:");
		display(p3,list);
		
		//All managers from bangalore 
		System.out.println("All managers from Bangalore to give Pink Slip:");
		display(p1.and(p2),list);
		
		//To select all employees who are managers or salaries <20000
		System.out.println("All Employees who are managers or salary <20000:");
		display(p1.or(p3),list);
		
		//all employees who are not managers
		
		System.out.println("All Employees who are not managers:"); 
		display(p1.negate(),list);
		
		
		
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for(Employee e :list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("**************************************************");

	}
	
	
	private static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Durga","ceo",30000,"Hyderobad"));
		list.add(new Employee("Sunny","Manager",20000,"Hyderobad"));
		list.add(new Employee("Mallika","Manager",20000,"Bangalore"));
		list.add(new Employee("Kareena","Lead",15000,"Hyderobad"));
		list.add(new Employee("Katrina","Lead",15000,"Bangalore"));
		list.add(new Employee("Anushka","Developer",10000,"Hyderobad"));
		list.add(new Employee("Kanushka","Developer",20000,"Hyderobad"));
		list.add(new Employee("Sowmya","Developer",10000,"Bangalore"));
		list.add(new Employee("Ramya","Developer",10000,"Bangalore"));
	}
	
}
