package com.assignment.domain;

public class ParrotFactory {
	
	public Parrot getParrot(ParrotType type) {
		switch(type) {
			case LiveWithDog:
				return new ParrotLiveWithDog();
			case LiveWithCat:
				return new ParrotLiveWithCat();			
			case LiveNearRooster:
				return new ParrotLiveNearRooster();			
			default:
				break;
		}
		
		return null;
	}
}
