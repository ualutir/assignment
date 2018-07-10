package com.assignment.domain;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChickenTest
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
	@Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    
    @Test
    public void TestChickenSing()
    {
    	Chicken chicken = new Chicken("Female");
    	chicken.sing();
    	assertEquals("Cluck, cluck", outContent.toString());
    	
    	Chicken rooster = new Chicken("Male");
    	rooster.sing();
    	assertEquals("Cock-a-doodle-doo", outContent.toString());
    }
}
