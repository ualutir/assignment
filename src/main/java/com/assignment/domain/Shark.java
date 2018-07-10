package com.assignment.domain;

public class Shark extends Fish{

	Shark(){
		super("gray", "large");
	}
	
	public void eatOtherFish(){
		System.out.println("I am eating fish");
	}
}

