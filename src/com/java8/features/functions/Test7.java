package com.java8.features.functions;

import java.util.Scanner;
import java.util.function.Function;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Username");
		
		String user= sc.next();
		
		System.out.println("Enter Password:");
		String psw = sc.next();
		
		Function<String,String> f1= s->s.substring(0,5);
		Function<String,String> f2 = s->s.toLowerCase();
		
		if(f1.andThen(f2).apply(user).equals("durga") && psw.equals("java")) {
			System.out.println("Valid user");
		}else {
			System.out.println("Invalid user");
		}
	}

}
