public class recursions2 {

    // public static int first = -1;
    // public static int last = -1;
    public static void main(String[] args) {
        
        // 9 best problems 

        // ques - tower of hanoi( time complexity O(2^n))

        // int n = 3;
        // towerofhanoi(n, "S", "H", "D");

        // ques - string in reverse (time complexity - O(n))

        // String str = "abcd";
        // printrev(str, str.length()-1);

         // ques - finding first and last occurence of the an element  (time complexity =O(n))

        //  String str = "abaacdaefaah";
        //  findoccurence(str, 0, 'a');





        
    }

    // findoccurence

    // public static void findoccurence(String str, int idx, char element) {
    //     if(idx==str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if (currChar==element) {
    //         if(first==-1) {
    //             first=idx;
    //         } else {
    //             last = idx;
    //         }
    //     }
    //     findoccurence(str, idx+1, element);
    // }

    // printrev

    // public static void printrev(String str, int idx) {
    //     if ( idx == 0) {
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.println(str.charAt(idx));
    //     printrev(str, idx-1);
    // }

    // towerofhanoi

    // public static void towerofhanoi(int n, String src, String helper, String dest) {
    //     if(n==1) {
    //     System.out.println("transfer disk" + n + "from " + src + "to"+dest);
    //     return;
            
    //     }
    //     towerofhanoi(n-1,src,dest,helper);
    //     System.out.println("transfer disk" + n + "from " + src + "to"+dest);
    //     towerofhanoi(n-1, helper, src, dest);
    // }
}
