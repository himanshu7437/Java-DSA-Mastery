public class recursions {
    public static void main(String[] args) {
        
        // recursion

        // example - printing from 1 to n
        // int n = 5;
        // printnum(n);

        // ques - print sum if first n natural number
        // printsum(1,5,0);

        // ques - factorial of a num
        // int num = 5;
        // int result =printfact(num);
        // System.out.println("the factorial is "+result);

        // ques- fibonacci series
        // int a=0, b=1;
        // System.out.println(a);
        // System.out.println(b);
        // int n =7;
        // printfibonacci(a, b, n);


    }

    //printfibonacci

    // public static void printfibonacci(int a, int b, int n) {
    //     if(n==0) {
    //         return;
    //     }
    //     int c = a+b;
    //     System.out.println(c);
    //     printfibonacci(b, c, n-1);;
    // }

    //printfact
    // public static int printfact(int num) {
    //     if (num==0) {
    //         return 1;
    //     } else if (num==1) {
    //         return 1;
    //     } else {
    //         return num*printfact(num-1);
    //     }
    // }

    //printsum
    // public static void printsum(int i, int n, int sum) {
    //     if(i==n ) {
    //         sum += i;
    //         System.out.println("the sum of n natural number is "+sum);
    //         return;
    //     }

    //     sum+=i;
    //     printsum(i+1, n, sum);
    // }


    // public static void printnum(int n) {
    //     if (n ==0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printnum(n-1);
    // }
    
    
}
