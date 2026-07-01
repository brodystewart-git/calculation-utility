package cen4082C;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationUtilityTest {

	
	// 1 normal case, 1 edge case, 1 fail case
	// Normal case, 12 should return 144.
	@Test
	void fibonacci_NormalCase() {
		int expected = 8;
		int result = CalculationUtility.fibonacci(6);
		assertEquals(expected, result, "Testing fibonacci method for the 6th place, expecting 8.");
		System.out.println("IT'S BEEN EDITED!!!");
	}

	// Edge case, 0 in the fibonacci sequence should be 0. 
	@Test
	void fibonacci_EdgeCase() {
		int expected = 0;
		int result = CalculationUtility.fibonacci(0);
		assertEquals(expected, result, "Testing fibonacci method for the 0th place, expecting 0.");
	}
	
	// Fail case, any negative number should be refused and return a fail catch (-1).
	@Test
	void fibonacci_FailCase() {
		int expected = -1;
		int result = CalculationUtility.fibonacci(-5);
		assertEquals(expected, result, "Testing fibonacci method for the -5th place, expecting -1 (fail catch).");
	}
	
}
