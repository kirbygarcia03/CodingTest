package com.codingtest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[1] Polymorphic features");
		System.out.println("[2] Producer-consumer");
		System.out.print("Please select number: ");
		int select = Integer.parseInt(scanner.nextLine());
		
		switch (select)
		{
		case 1:
			System.out.println("~~~Method Overloading~~~");
			MethodOverloading methodOverloading = new MethodOverloading();
			methodOverloading.Sample(1, 2, 3);
			
			System.out.println("~~~Method Overriding~~~");
			MethodOverriding methodOverriding = new MethodOverriding();
			methodOverriding.Sample2();
			break;
		case 2:
			Producer producer = new Producer();
			producer.start();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Consumer consumer = new Consumer();
			consumer.start();
			break;
		
		}
		scanner.close();
		
	}

}
