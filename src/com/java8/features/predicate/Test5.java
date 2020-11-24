package com.java8.features.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<User> p = user->user.username.equals("Durga") && user.pwd.equals("java");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		
		String username = sc.next();
		
		System.out.println("Enter PWD");
		String pwd =sc.next();
		
		User user = new User(username, pwd);
		
		if(p.test(user)) {
			System.out.println("Valid user, you can get all services");
		}else {
			System.out.println("Invalid user plz login again");
		}
		
		
		
		
		
		
		
		
	}

}
