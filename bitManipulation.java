
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
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number -");
        // int n = sc.nextInt();

        // int count=0;

        // while (n!=0) { 
        //     count+= n&1;
        //     n>>=1;
        // }
        
        // System.out.println("the number of one is " + count);

       // ques - Write 2 programs => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.

       // decimal to binary

    //    int n = 10;
    //    StringBuilder binary = new StringBuilder();
        
    //    if (n==0) {
    //        System.out.println("0");
    //    } else {
    //        while(n>0) {
    //         binary.insert(0, n%2);
    //         n/=2;
    //        }
    //    }

    //    String result = binary.toString();
    //    System.out.println("the binary number is " + result);


    // decimal to binary

    // String binary = "1000";
    //    int decimal = 0;
    //    int length = binary.length();

    //     for (int i = 0; i < length; i++) {
    //         int bit = binary.charAt(length-1-i) - '0';
    //         decimal += bit * Math.pow(2, i);
    //     }

    //    System.out.println("the number is " + decimal);

    } 
}
