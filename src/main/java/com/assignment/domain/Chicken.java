package com.assignment.domain;

public class Chicken extends Bird{
	
	private String _type;	
	
	public Chicken(String type) {
		this._type = type;
	}

	@Override
	public void sing() {
		if(_type.equals("Female")) {
			System.out.println("Cluck, cluck");
		}
		else if(_type.equals("Male")) {
			System.out.println("Cock-a-doodle-doo");
		}
	}
}
