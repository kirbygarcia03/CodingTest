package com.codingtest;

public class MethodOverriding extends Parent {
	
	public void Sample2() {
		System.out.println("Child");
	}

}

class Parent {
	
	public void Sample2() {
		System.out.println("Parent");
	}
	
}
