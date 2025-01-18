public class PatternQuestions1 {
    public static void main(String[] args) {
      int n = 5; // Number of rows for patterns
  
      // **1. Solid Rectangle**
      System.out.println("1. Solid Rectangle:");
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
      System.out.println();
  
      // **2. Right Triangle**
      System.out.println("2. Right Triangle:");
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
      System.out.println();
  
      // **3. Inverted Right Triangle**
      System.out.println("3. Inverted Right Triangle:");
      for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
      System.out.println();
  
      // **4. Pyramid**
      System.out.println("4. Pyramid:");
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
          System.out.print("  "); // Print spaces
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
      System.out.println();
  
      
    }
  }
  