package com.assignment.domain;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DuckTest
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
    public void TestDuckSing()
    {
    	Duck duck = new Duck();
    	duck.sing();
    	assertEquals("Quack, quack", outContent.toString());
    }
    
    @Test
    public void TestDuckSwimming()
    {
    	Duck duck = new Duck();
    	duck.swim();
    	assertEquals("I am swimming", outContent.toString());
    }
}
