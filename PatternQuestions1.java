public class PatternQuestions1 {
  public static void main(String[] args) {
      // Program to display various pattern questions

      // Question 1: Star Rectangle (4x5)
      // Creates a rectangle of '*' with 4 rows and 5 columns
      // Uncomment the code below to run this pattern
      /*
      for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 5; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
      */

      // Question 2: Hollow Rectangle (4x5)
      // Creates a hollow rectangle where the boundary is '*' and inside is empty
      // Uncomment the code below to run this pattern
      /*
      int n = 4;
      int m = 5;
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= m; j++) {
              if (i == 1 || j == 1 || i == n || j == m) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
      */

      // Question 3: Pyramid Pattern
      // Creates a pyramid with '*' increasing row by row
      /*
      int k = 7;
      for (int i = 1; i <= k; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
      */

      // Question 4: Reverse Pyramid Pattern
      // Creates an inverted pyramid with '*' decreasing row by row
      /*
      for (int i = k; i >= 1; i--) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
      */

      // Question 5: 180 Degree Rotated Pyramid
      // Creates a right-aligned pyramid by adding spaces before '*'
      /*
      for (int i = 1; i <= k; i++) {
          for (int j = 1; j <= k - i; j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
      */

      // Question 6: Number Pyramid
      // Creates a pyramid with numbers increasing in each row
      /*
      for (int i = 1; i <= k; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(j + " ");
          }
          System.out.println();
      }
      */

      // Question 7: Inverted Number Pyramid
      // Creates a pyramid with numbers decreasing row by row
      /*
      for (int i = 1; i <= k; i++) {
          for (int j = 1; j <= k - i + 1; j++) {
              System.out.print(j);
          }
          System.out.println();
      }
      */

      // Question 8: Floyd's Triangle
      // Creates a triangle with numbers increasing sequentially
      /*
      int num = 1;
      for (int i = 1; i <= k; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(num + " ");
              num++;
          }
          System.out.println();
      }
      */

      // Question 9: 0-1 Triangle
      // Alternates between '0' and '1' in a triangular pattern
      /*
      for (int i = 1; i <= k; i++) {
          for (int j = 1; j <= i; j++) {
              if ((i + j) % 2 == 0) {
                  System.out.print(1);
              } else {
                  System.out.print(0);
              }
          }
          System.out.println();
      }
      */
  }
}
