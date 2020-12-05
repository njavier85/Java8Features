package com.java8.features.consumer;

import java.util.function.Consumer;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<Movie> c1= m-> System.out.println("Movie: "+m.name+" is ready to release");
		
		Consumer<Movie> c2 = m->System.out.println("Movie: "+m.name+" is just Released "+m.result);
		
		Consumer<Movie> c3 = m->System.out.println("Movie: "+m.name+" Information storing in the database");
		
		Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);
		
		Movie m = new Movie("Bahubali","Hit");
		
		chainedC.accept(m);
	}

}
