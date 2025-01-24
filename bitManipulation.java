import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        // get,set,update,delete bit operation (bit manipulation)

        // 1. get

        // int n = 5;
        // int bitmask=1<<3;

        // if ((n&bitmask)==0) {
        //     System.out.println("it is zero");
        // } else {
        //     System.out.println("it is one.");
        // }


        // set 

        // int n = 5;
        // int bitmask=1<<1;
        // int result = n|bitmask;

        // System.out.println("this is "+result);

        // clear 

        // int n = 5;
        // int bitmask=1<<2;
        // int notbitmask = ~(bitmask);
        // int result = n & notbitmask;

        // System.out.println("the number is"+ result);

        //update
        // Scanner sc = new Scanner(System.in);
        // int n = 5;
        // int bitmask=1<<1;
        // int choice = sc.nextInt();

        // if (choice==0) {
        //     int notbitmask = ~(bitmask);
        //     int result = n % notbitmask;
        //     System.out.println("the result is "+ result);
        // } else if (choice == 1) {
        //     int result = n | bitmask;
        //     System.out.println("the answer is " + result);
        // }

        // ques - Write a program to count the number of 1’s in a binary representation of the number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number -");
        int n = sc.nextInt();

        int count=0;

        while (n!=0) { 
            count+= n&1;
            n>>=1;
        }
        
        System.out.println("the number of one is " + count);

    }
}
