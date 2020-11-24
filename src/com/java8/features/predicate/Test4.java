package com.java8.features.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"Durga","",null,"Ravi","","Shiva",null};
	
		Predicate<String> p = s->s!=null && s.length()!=0;
		
		ArrayList<String> l =new ArrayList<String>();
		
		for(String s:names) {
			if(p.test(s)) {
				l.add(s);
			}
		}
		
		System.out.println("The list of valid strings:");
		System.out.println(l);
	
	}

}
