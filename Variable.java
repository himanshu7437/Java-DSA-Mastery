import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {

        // Printing output in Java
        System.out.print("HelloWorld"); // Prints text without a new line
        System.out.println("HelloWorld"); // Prints text and moves to the next line
        System.out.print("HelloWorld\n"); // "\n" also moves to the next line

        // Example: Printing a star pattern with increasing stars on each line
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        // VARIABLES AND CONSTANTS
        // Primitive Data Types
        // 1. byte: 8-bit integer, range: -128 to 127
        byte byteValue = 127;
        System.out.println("Byte Value: " + byteValue);

        // 2. short: 16-bit integer, range: -32,768 to 32,767
        short shortValue = 32767;
        System.out.println("Short Value: " + shortValue);

        // 3. int: 32-bit integer, range: -2^31 to 2^31-1
        int intValue = 2147483647;
        System.out.println("Integer Value: " + intValue);

        // 4. long: 64-bit integer, range: -2^63 to 2^63-1
        long longValue = 9223372036854775807L; // 'L' denotes long literals
        System.out.println("Long Value: " + longValue);

        // 5. float: 32-bit floating-point, used for decimals
        float floatValue = 3.14f; // 'f' denotes float literals
        System.out.println("Float Value: " + floatValue);

        // 6. double: 64-bit floating-point, higher precision than float
        double doubleValue = 3.141592653589793;
        System.out.println("Double Value: " + doubleValue);

        // 7. char: 16-bit Unicode character
        char charValue = 'A';
        System.out.println("Char Value: " + charValue);

        // 8. boolean: Represents true or false
        boolean booleanValue = true;
        System.out.println("Boolean Value: " + booleanValue);

        // Non-Primitive Data Types
        // 1. String: A sequence of characters
        String stringValue = "Hello, Java!";
        System.out.println("String Value: " + stringValue);

        // 2. Array: A collection of elements of the same type
        int[] arrayValue = {1, 2, 3, 4, 5};
        System.out.print("Array Values: ");
        for (int num : arrayValue) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculating and printing the sum and multiplication of two numbers
        int y = 34;
        int z = 55;
        int sum = y + z;
        int mul = y * z;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + mul);

        // Taking input from the user using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Reads a line of input (String)
        System.out.println("Hello, " + name);

        // Practice question: Take two integers from the user and print their sum
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt(); // Reads an integer input
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt(); // Reads another integer input
        System.out.println("The sum of a and b is: " + (a + b));

        // Closing the Scanner to release resources
        sc.close();
    }
}