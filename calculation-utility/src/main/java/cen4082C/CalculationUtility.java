package cen4082C;

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
 * @since 2026-08-26
 */

public class CalculationUtility {
	
	public static void main(String[] args) {
		// This section is purely temporary for this specific assignment, so felt no need to make a comment for this main. 
		// Assuming this will be used as a hub for mathematical functions later in the course, so I doubt main will even really need to exist.
		int num = 9;
		System.out.println("Midterm Example!!");
		System.out.println("Current number selected to find in the Fibonacci sequence: " + num);
		int result = fibonacci(num);
		if(result == -1) {
			System.out.println("The number you input was invalid. Please try again with a different number.");
		}else {
			System.out.println("The number at position " + num + " of the sequence is " + result);
		}
	}
	
    /**
     * Simple Fibonacci sequence that doesn't support negafibonacci. Takes a number n, returning the number in the sequence at that exact location.
     * 
     * <p>This method finds a number in the Fibonacci sequence from the given {@code n} parameter, returning the result.
     * If the number is negative, it returns a fail state of {@code -1}.</p>
     *
     * @param n the index in the Fibonacci sequence to calculate (non-negative number)
     * @return the Fibonacci number at index {@code n}  | -1 if {@code n} is invalid.
     */
	public static int fibonacci(int n) {
		if (n < 0) return -1;
		if(n == 0 || n == 1) return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}

