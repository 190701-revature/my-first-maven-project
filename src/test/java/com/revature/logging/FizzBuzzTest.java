package com.revature.logging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.sample.Fizzbuzz;

/**
 * Junit is a unit testing framework for Java. It's largely the standard
 * initial configuration for unit testing with the Java language. Junit itself
 * does not have a useful configuration for mocking/stubbing, so in order to 
 * mock dependencies we need additional tools, such as Mockito.
 *
 */
public class FizzBuzzTest {

	/**
	 * Helpful annotations
	 * @Before - Runs before each test
	 * @After - Runs after each test
	 * @BeforeClass - Runs before entire class begins testing
	 * @AfterClass - Runs after entire class tests are complete
	 */
	
	
	static Fizzbuzz f = new Fizzbuzz();
	
	@Before
	public void beforeSample() {
		System.out.println("Before a test");
	}
	
	@After
	public void afterSample() {
		System.out.println("After a test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class Tests");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class Tests");
	}
	

	
	
	
	// Without this annotation, Junit doesn't know to run this method as a test
	@Test
//	@Ignore // Tells Junit to ignore this test and report it as ignored
	public void testIntegerResult() {
		String result = f.fizzbuzz(11);
		// How to define our expectations
		assertEquals("Input 11 is not divisible by 3 or 5 so should return string 11", 
				"11", result);
	}
	
	@Test
	public void testThree() {
		String result = f.fizzbuzz(3);
		assertEquals("Input 3 is divisible by 3 and not 5 so it should return 'Fizz'", 
				"Fizz", result);
	}
	
	@Test
	public void testFive() {
		String result = f.fizzbuzz(5);
		assertEquals("Input 5 is divisible by 5 and not 3 so it should return 'Buzz'",
				"Buzz", result);
	}
	
	@Test
	public void testFifteen() {
		String result = f.fizzbuzz(15);
		assertEquals("Input 15 is divisible by both 5 and 3 so it should return 'Fizzbuzz'",
				"Fizzbuzz", result);
	}
	
	// How to assert that an exception should be thrown
	@Test(expected=InvalidParameterException.class)
	public void testZero() {
		String result = f.fizzbuzz(0);
		fail();
	}
}
