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

    

    // Closing the Scanner
    sc.close();
  }
}
