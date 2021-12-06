/*
* Determine the factorial of a given number
*/

import java.util.Scanner;

/**
* Factorial class.
*/

final class Factorial {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Factorial() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * Reverses user input string.
    *
    * @param anyInt any int input by the user
    * @return The factorial of the number
    */

    public static int factorial(final int anyInt) {
        int returnValue = 0;
        // Uses recursion to reverse string
        if (anyInt == 1) {
            returnValue = anyInt;
        } else {
            returnValue = anyInt * factorial(anyInt - 1);
        }
        return returnValue;
    }
    /**
    * The Starting main() function.
    *
    * @param args Not used.
    * @throws InputMismatchException If user input is invalid
    */

    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        try {
            System.out.println("Input your integer: ");
            final int userInt = myObj.nextInt();
            final int factorialInt = factorial(userInt);
            // Output
            System.out.println("The factorial of that is: " + factorialInt);
            System.out.println("Done.");
        } catch (java.util.InputMismatchException error) {
            System.out.println("Invalid input, must be an integer");
        }
    }
}
