package com.revature.sample;

import java.security.InvalidParameterException;

/**
 * A fizzbuzz problem is generally a function that takes in an integer value
 * and then returns one of the following given the described condition:
 * IF the input is divisible by both 3 and 5, return "Fizzbuzz"
 * IF the input is divisible by 3 and not 5, return "Fizz"
 * IF the input is divisible by 5 and not 3, return "Buzz"
 * Otherwise return the input integer value
 *
 */
public class Fizzbuzz {
	
	public String fizzbuzz(int i) {
	
		if (i == 0) {
			throw new InvalidParameterException();
		}
		
		if (i % 5 == 0 && i % 3 == 0) {
			return "Fizzbuzz";
		}
		
		if (i % 5 == 0) {
			return "Buzz";
		}
		
		if (i % 3 == 0) {
			return "Fizz";
		}
		
		return String.valueOf(i);
	}

}
