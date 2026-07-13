package cen4082C;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class consists exclusively of mathematical methods that are designed to be used throughout the semester.
 *
 * <p>This program is meant to feature multiple methods which allow for calculations in 
 * regard to what assignments require throughout the CEN4802C Software Integration, Configuration, and Testing course. It is required to be designed
 * as if there will be more to add to the program in the future, instead of a one-off assignment. Hence, the documenation. </p>
 *
 * @author Brody Stewart
 * <p>Course: CEN 4802C - Software Integration, Configuration, and Testing</p>
 * @version 0.1
 * @since 2026-07-11
 */

public class CalculationUtility {
	private static final boolean SAFETY_ENABLED = true;
	private static final Logger logger = LoggerFactory.getLogger(CalculationUtility.class);
	
	public static void main(String[] args) {
		logger.info("Starting Calculation Utility program.");
		for (int i = -5; i <= 100; i++) {
			int num = fibonacci(i);
			
			if (num >= 0) {
				logger.info("The number at position {} of the sequence is {}", i, num);
			} 
			else if (num == -1) {
				logger.warn("The number {i} is invalid (negative input). ", i);
			}
			if (num == -2) {
				logger.error("The number as position {} of the sequence is too long and will cause a hang. Calculation halted for safety metrics.", i);
			}
		}
	}
	
    /**
     * Simple Fibonacci sequence that doesn't support negafibonacci. Takes a number n, returning the number in the sequence at that exact location.
     * 
     * <p>This method finds a number in the Fibonacci sequence from the given {@code n} parameter, returning the result.
     * If the number is negative, it returns a fail state of {@code -1}. Includes a safety mechanism to prevent exponential execution lag.</p>
     *
     * @param n the index in the Fibonacci sequence to calculate (non-negative number) 
     * @return the Fibonacci number at index {@code n}  | -1 if {@code n} is invalid | -2 if safety limits are breached.
     */
	public static int fibonacci(int n) {
		if (n < 0) return -1;
		if(SAFETY_ENABLED && n > 40) return -2;
		if(n == 0 || n == 1) return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}

