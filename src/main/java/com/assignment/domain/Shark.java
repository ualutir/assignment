package com.assignment.domain;

public class Shark extends Fish{

	public Shark(){
		super("gray", "large");
	}
	
	public void eatOtherFish(){
		System.out.println("I am eating fish");
	}
}

