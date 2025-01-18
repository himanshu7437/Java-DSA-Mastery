import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner sc = new Scanner(System.in);

    // **Example 1: Printing Numbers with a For Loop**
    // The `for` loop is used when we know in advance how many times we want to execute a block of code.
    System.out.println("Example 1: Printing numbers from 1 to 5 using a for loop:");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Number: " + i);
    }

    // **Example 2: Calculating Sum with a While Loop**
    // The `while` loop is used when we don't know the number of iterations beforehand, but we have a condition to check.
    System.out.println("\nExample 2: Enter numbers to calculate their sum. Enter -1 to stop:");
    int sum = 0;
    int num = sc.nextInt();
    while (num != -1) { // Loop continues until the user enters -1
      sum += num;
      System.out.println("Current Sum: " + sum);
      num = sc.nextInt();
    }
    System.out.println("Final Sum: " + sum);

    // **Example 3: Validating Input with a Do-While Loop**
    // The `do-while` loop ensures the block of code runs at least once, even if the condition is initially false.
    System.out.println("\nExample 3: Guess a number between 1 and 10:");
    int guess;
    int target = 7; // Target number to guess
    do {
      System.out.print("Enter your guess: ");
      guess = sc.nextInt();
      if (guess != target) {
        System.out.println("Wrong guess, try again!");
      }
    } while (guess != target); // Loop until the correct guess
    System.out.println("Correct! The number was " + target + ".");

    // **Example 4: Nested Loops for Patterns**
    // Nested loops can be used for complex iterations, such as generating patterns.
    System.out.println("\nExample 4: Printing a simple pattern:");
    int rows = 4;
    for (int i = 1; i <= rows; i++) { // Outer loop for rows
      for (int j = 1; j <= i; j++) { // Inner loop for columns
        System.out.print("* ");
      }
      System.out.println(); // Move to the next line after each row
    }

    // Closing the Scanner
    sc.close();
  }
}
