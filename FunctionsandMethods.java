import java.util.*;
public class FunctionsandMethods {

    // print the name
    // public static void printMyName(String name) {
    //     System.out.println(name);
    //     return;
    // }

    // sum 
    // public static int printSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }

    //product
    // public static int printProduct(int c, int d) {
    //     return c*d;
    // }


    // Factorial of a number
    public static int printFactorial(int num) {
        if (num==1) {
            return 1;
        } 
        else if (num==0) {
            return 1;
        }
        else {
            return num*printFactorial((num-1));
        }
    }




    public static void main(String[] args) {
        //functions 

        // printing a name by printMyName function

         Scanner sc = new Scanner(System.in);
        // String name = sc.next();

        // printMyName(name);


        // printing a sum

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int result = printSum(a,b);
        // System.out.println("sum:" + result);

        // multiply two numbers 

        // int c = sc.nextInt();
        // int d = sc.nextInt();
        // int result = printProduct(c,d);
        // System.out.println("Product:" + result);

        // factorial of a number

        int num = sc.nextInt();
        int result = printFactorial(num);
        System.out.println("Facorial :" + result );
    }
}