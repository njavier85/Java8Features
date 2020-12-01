package com.java8.features.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {
		//find grade of student based on the mark
		ArrayList<Student> l = new ArrayList<Student>();
		populate(l);
		
		Function<Student,String> f = s->{
			int marks = s.marks;
			if(marks>=80) {
				return "A[Distictioin]";
			}
			else if(marks>=60) {
				return "B[First Class]";
			}
			else if(marks>=50) {
				return "C[Second Class]";
			}
			else if(marks>=35) {
				return "D[Third Class]";
			}
			else {
				return "E[Failed]";
			}
		};
					
		
		Predicate<Student> p = s->s.marks>=60;
		
		for(Student student :l) {
			if(p.test(student)) {
				System.out.println("Name: "+student.name);
				System.out.println("Marks: "+student.marks);
				System.out.println("Grade: " +f.apply(student));
				System.out.println();
			}	
		}
	}

	private static void populate(ArrayList<Student> l) {
		l.add(new Student("Sunny",100));
		l.add(new Student("Bunny",65));
		l.add(new Student("Chinny",55));
		l.add(new Student("Vinny",45));
		l.add(new Student("Pinny",22));
	}

}
