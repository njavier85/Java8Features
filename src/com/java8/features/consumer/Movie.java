package com.java8.features.consumer;

public class Movie {

	String name;
	String hero;
	String heroine;
	public String result;
	
	public Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}

	public Movie(String name, String result) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.result=result;
		
	}
	
	
	
}
