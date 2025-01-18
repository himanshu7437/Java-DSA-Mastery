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

    
    // Closing the Scanner
    sc.close();
  }
}
