package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.domain.Animal;
import com.assignment.domain.Bird;
import com.assignment.domain.Chicken;
import com.assignment.domain.Duck;
import com.assignment.domain.Fish;
import com.assignment.domain.Flyer;
import com.assignment.domain.Parrot;
import com.assignment.domain.Shark;
import com.assignment.domain.Swimmer;
import com.assignment.domain.Walker;
import com.assignment.domain.ClownFish;
import com.assignment.domain.Dolphin;
import com.assignment.domain.Butterfly;;

@SpringBootApplication
public class Solution {

	private static int flyingAnimalCount = 0;
	private static int singingAnimalCount = 0;
	private static int walkingAnimalCount = 0;
	private static int swimingAnimalCount = 0;
	
	public static void main(String[] args) {
		SpringApplication.run(Solution.class, args);
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken("Male"),
				new Chicken("Female"),
				new Parrot(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphin(),
				new Butterfly()
		};
		
		for (Animal animal: animals){
		    if (animal instanceof Flyer) {
		    	flyingAnimalCount++;
		    }
		    if (animal instanceof Walker){
		    	walkingAnimalCount++;
		    } 
		    if (animal instanceof Bird) {
		    	singingAnimalCount++;
		    } 
		    if (animal instanceof Swimmer){
		    	swimingAnimalCount++;
		    }
		}
		
		System.out.println("Flying Count: " + flyingAnimalCount);
		System.out.println("Walking Count: " + walkingAnimalCount);
		System.out.println("Singing Count" + singingAnimalCount);
		System.out.println("Swiming Count: " + swimingAnimalCount);
	}
}
