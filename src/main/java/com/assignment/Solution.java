package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.domain.Bird;
import com.assignment.domain.Chicken;
import com.assignment.domain.Duck;

@SpringBootApplication
public class Solution {

	public static void main(String[] args) {
		SpringApplication.run(Solution.class, args);
		
		Bird bird = new Bird();
		bird.walk();
		
		Duck duck = new Duck();
		duck.swim();
		duck.sing();
		
		Chicken chicken = new Chicken("Male");		
		chicken.sing();
		
		Chicken rooster = new Chicken("Female");		
		rooster.sing();
	}
}
