import java.util.*;

/**
 * A collection of functions and methods demonstrating basic operations
 * like printing a name, calculating sum, product, and factorial.
 */
public class FunctionsandMethods {

    /**
     * Calculates the factorial of a given number recursively.
     * Factorial of a number n is defined as n * (n-1) * (n-2) ... * 1.
     * Special cases:
     *  - Factorial of 0 is 1.
     *  - Factorial of 1 is 1.
     * 
     * @param num The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int printFactorial(int num) {
        if (num == 1 || num == 0) { // Base cases
            return 1;
        } else { // Recursive case
            return num * printFactorial(num - 1);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Example: Uncomment the following blocks to test individual functions

        // Printing a name using the printMyName function
        // System.out.print("Enter your name: ");
        // String name = sc.next();
        // printMyName(name);

        // Calculating the sum of two numbers
        // System.out.print("Enter two numbers to find their sum: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = printSum(a, b);
        // System.out.println("Sum: " + sum);

        // Calculating the product of two numbers
        // System.out.print("Enter two numbers to find their product: ");
        // int c = sc.nextInt();
        // int d = sc.nextInt();
        // int product = printProduct(c, d);
        // System.out.println("Product: " + product);

        // Calculating the factorial of a number
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();
        int result = printFactorial(num);
        System.out.println("Factorial: " + result);

        // Close the scanner to prevent resource leaks
        sc.close();
    }

    /**
     * Prints the provided name.
     * 
     * @param name The name to be printed.
     */
    public static void printMyName(String name) {
        System.out.println("Name: " + name);
    }

    /**
     * Calculates the sum of two integers.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public static int printSum(int a, int b) {
        return a + b;
    }

    /**
     * Calculates the product of two integers.
     * 
     * @param c The first integer.
     * @param d The second integer.
     * @return The product of c and d.
     */
    public static int printProduct(int c, int d) {
        return c * d;
    }
}
