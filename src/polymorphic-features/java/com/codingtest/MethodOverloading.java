package com.codingtest;

public class MethodOverloading {
	
	public void Sample(int a) {
		System.out.println("Displaying one parameter: " + a);
	}
	
	public void Sample(int a, int b) {
		System.out.println("Displaying two parameters: " + a + " and " + b);
	}
	
	public void Sample(int a, int b, int c) {
		System.out.println("Displaying three parameters: " + a + ", " + b + " and " + c);
	}
	
}
