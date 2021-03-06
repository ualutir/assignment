package com.assignment.domain;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for AssignmentApplication.
 */
public class BirdTest
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
    public void TestBirdSing()
    {
    	Bird bird = new Bird();
    	bird.sing();
    	assertEquals("I am singing", outContent.toString());
    }
}
