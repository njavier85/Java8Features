package com.java8.features.anonymousinnerclasses;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new Runnable() {
			public void run() {
				for(int i =0;i<10;i++) {
					System.out.println("Child Thread");
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		/****************************************/
		
		
		Runnable r1 = ()->{
			for(int i =0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread t1 = new Thread(r1);
		for(int i = 0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		/*********************************************/
		
		Thread t2 = new Thread(()->{
						for(int i =0;i<10;i++) {
							System.out.println("Child Thread");
						}
					}
				);
		t2.start();
	}

}
