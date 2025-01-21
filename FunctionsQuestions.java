
// Write a function to print the sum of all odd numbers from 1 to n.
// Write a function which takes in 2 numbers and returns the greater of those two.
// Write a function that takes in the radius as input and returns the circumference of a circle.
// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// Write an infinite loop using do while condition.
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)


public class FunctionsQuestions {

    // printAverage

    // public static int printAverage(int a, int b, int c) {
    //     return (a + b + c) / 3;
    // }

    //...............................................

    //printSumOfOdd

    // public static int printSumOfOdd(int n) {
    //     int sum = 0;
    //     for (int i = 0; i <= n; i++) {
    //         if (i % 2 != 0) {
    //             sum = sum+i;
    //         }
    //     }
    //     return sum;
    // }

    // ................................................

    //printGreater

    // public static void printGreater(int a, int b) {
    //     if (a<b) {
    //         System.out.println("the greater number is " + b);
    //     } else {
    //         System.out.println("the greater number is " + a);
    //     }
    // }

    //..............................................

    //printCircumference

    // public static void printCircumference(int r) {
    //     System.out.println("The Circumference of the circle is" + 2*(22/7)*r);
    // }

    //...............................................

    //printElgiblityCriteria

    // public static void printEligibleCriteria(int age) {
    //     if (age < 18) {
    //         System.out.println("you are not Eligible.");
    //     } 
    //     else {
    //         System.out.println("you are eligible");
    //     }
    // }

    //..............................................

    //printExponent

    // public static double  printExponent(double x, double n) {
    //    return Math.pow(x, n);
    // }

    //...........................................

    // printfibonacci

    // public static int printfibonacci(int i) {
    //     if (i<=1) {
    //         return i;
    //     } else {
    //         return printfibonacci(i-1) + printfibonacci(i-2);
    //     }
    // }

    //...........................................

    // printgcd
    // public static int printgcd(int x, int n) {
    //     int reminder = x%n;
    //     if (reminder==0) {
    //         return n;
    //     } else {
    //         return printgcd(n, reminder);
    //     }
    // }

    public static void main(String[] args) {

        // ques -1 Enter 3 numbers from the user & make a function to print their
        // average.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the First number :");
        // int a = sc.nextInt();
        // System.out.println("Enter the Second number :");
        // int b = sc.nextInt();
        // System.out.println("Enter the Third number :");
        // int c = sc.nextInt();
        // int result = printAverage(a, b, c);
        // System.out.println("the average is :" + result);

        //...........................................

        // ques -2 Write a function to print the sum of all odd numbers from 1 to n.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number :");
        // int n = sc.nextInt();
        // int result = printSumOfOdd(n);
        // System.out.println("the sum of all odd number from 1 to n is " + printSumOfOdd(n));

        //...........................................

        // ques - 3 Write a function which takes in 2 numbers and returns the greater of those two.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the First number :");
        // int a = sc.nextInt();
        // System.out.println("Enter the Second number :");
        // int b = sc.nextInt();
        // printGreater(a,b);

        //...........................................

        //ques- 4 Write a function that takes in the radius as input and returns the circumference of a circle.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the radius:");
        // int r = sc.nextInt();
        // printCircumference(r);

        //..............................................

        // ques - 5 // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter ur age:");
        // int age = sc.nextInt();
        // printEligibleCriteria(age);

        //.............................................

        // ques- 6 // Write an infinite loop using do while condition.

        // do { 
        //     System.out.println("Hacked!!!!!");

        // } while (true);

        //...........................................

        // ques - 7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

        //  Scanner sc = new Scanner(System.in);
        //  int positivenum =0;
        //  int negativeenum =0;
        //  int zeros =0;
        //  char answer;
        //  do { 
        //     System.out.println("enter your number:");
        //     int a = sc.nextInt();
        //     if (a == 0) {
        //         zeros++;
        //     }
        //     else if(a>0) {
        //         positivenum++;
        //     }
        //     else {
        //         negativeenum++;
        //     }
        //     System.out.println("do you want to continue(y/n):");
        //     answer = sc.next().charAt(0);            
        //  } while (answer == 'y' || answer == 'Y');

        //  System.out.println("................");
        //  System.out.println("Total number of positive numbers are :" + positivenum);
        //  System.out.println("Total number of negative numbers are :" + negativeenum);
        //  System.out.println("Total number of zeros  are :" + zeros);

        //...........................................

        //ques-8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the First number :");
        // double x = sc.nextInt();
        // System.out.println("Enter the Second number :");
        // double  n = sc.nextInt();
        // double result = printExponent(x,n);
        // System.out.println("the value is " + result);

        //...........................................

        // ques - 9 Write a function that calculates the Greatest Common Divisor of 2 numbers.    
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the First number :");
        // int x = sc.nextInt();
        // System.out.println("Enter the Second number :");
        // int  n = sc.nextInt();
        // int result = printgcd(x,n);
        // System.out.println("the gcd of two number ia " + result);



        // ques - 10 Write a program to print Fibonacci series of n terms where n is input by user :
        // 0 1 1 2 3 5 8 13 21 ..... 

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        //itertive approach
        // int first = 0;
        // int second = 1;
        // for (int i = 0; i < num; i++) {
        //     System.out.print(first +" ");
        //     int next = first + second;
        //     first = second;
        //     second = next;
        // }
        
        // recursive approach
        // for (int i = 0; i < num; i++) {
        //     System.out.print(printfibonacci(i) + " "); 
        // }

    }
}