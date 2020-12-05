package com.java8.features.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Movie> l = new ArrayList<Movie>();
		
		populate(l);
		
		Consumer<Movie> c = m->{
			System.out.println("Movie name: "+m.name);
			System.out.println("Movie hero: "+m.hero);
			System.out.println("Movie Heroine: "+m.heroine);
			System.out.println("***************");

		};
		
		for(Movie m:l) {
			c.accept(m);
		}
	}

	private static void populate(ArrayList<Movie> l) {
		l.add(new Movie("Bahubali","Prabhas","Anushka"));
		l.add(new Movie("Rayees","Sharukh","Sunny"));
		l.add(new Movie("Dangal","Ameer","Ritu"));
		l.add(new Movie("Sultan","Salmon","Anushka"));
	}

}
