package com.assignment.domain;

public class Butterfly extends Animal implements Flyer {

	@Override
	public void fly() {
		System.out.println("I am flying");		
	}

}
