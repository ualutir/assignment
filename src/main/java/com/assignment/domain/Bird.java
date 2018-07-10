package com.assignment.domain;

public class Bird extends Animal implements Walker{	
	
	@Override
	public void walk() {
		System.out.println("I am walking");
	}
	
	public void sing() {
		System.out.println("I am singing");
	}
}
