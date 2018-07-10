package com.assignment.domain;

public class Duck extends Bird implements Swimmer{
	
	@Override
	public void swim(){
		System.out.println("I am swimming");
	}
	
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}
}
