public class AdvancePatternQuestions {
    public static void main(String[] args) {
        // Butterfly Pattern (Question 10)
        int k = 4;
        for (int i = 1; i <= k; i++) {
            // Print stars in the left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the center
            for (int j = 1; j <= (2 * k - 2 * i); j++) {
                System.out.print(" ");
            }
            // Print stars in the right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = k; i >= 1; i--) {
            // Print stars in the left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the center
            for (int j = 1; j <= (2 * k - 2 * i); j++) {
                System.out.print(" ");
            }
            // Print stars in the right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Rhombus Pattern (Question 11)
        int p = 4;
        for (int i = 1; i <= p; i++) {
            // Print leading spaces
            for (int j = 1; j <= (p - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= p; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Number Pyramid (Question 12)
        for (int i = 1; i <= p; i++) {
            // Print leading spaces
            for (int j = 1; j <= (p - i); j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Palindrome Pattern (Question 13)
        for (int i = 1; i <= p; i++) {
            // Print leading spaces
            for (int j = 1; j <= (p - i); j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Diamond Pattern (Question 14)
        for (int i = 1; i <= p; i++) {
            // Print leading spaces
            for (int j = 1; j <= p - i; j++) {
                System.out.print(" ");
            }
            // Print stars in the upper half
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = p; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= p - i; j++) {
                System.out.print(" ");
            }
            // Print stars in the lower half
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
