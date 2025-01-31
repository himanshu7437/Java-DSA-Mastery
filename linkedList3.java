
public class linkedList3 {

    public static void main(String[] args) {

        // linked list questions

        // ques -1)
        // https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

        // class Solution {
        // public ListNode removeNthFromEnd(ListNode head, int n) {
        // if (head.next == null ) {
        // return null;
        // }

        // // to get the size
        // int size = 0;
        // ListNode curr = head;
        // while (curr != null) {
        // curr = curr.next;
        // size++;
        // }

        // // special case (when size == n)
        // if(n == size) {
        // return head.next;
        // }
        // // previous to the nth node
        // int indexToSearch = size - n;
        // ListNode prev = head;
        // int i = 1;
        // while (i < indexToSearch ) {
        // prev = prev.next;
        // i++;
        // }

        // // deleting the nth node
        // prev.next = prev.next.next;
        // return head;

        // }
        // }

        // ques - 2 https://leetcode.com/problems/palindrome-linked-list/

        /**
         * Definition for singly-linked list.
         * public class ListNode {
         * int val;
         * ListNode next;
         * ListNode() {}
         * ListNode(int val) { this.val = val; }
         * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */
        // class Solution {
        // public ListNode reverse(ListNode head) {
        // ListNode prev = null;
        // ListNode curr = head;

        // while(curr!=null) {
        // ListNode next = curr.next;
        // curr.next = prev;
        // prev = curr;
        // curr = next;
        // }

        // return prev;
        // }

        // public ListNode findMiddle(ListNode head) {
        // ListNode hare = head;
        // ListNode turtle = head;

        // while(hare.next!=null && hare.next.next != null) {
        // hare = hare.next.next;
        // turtle = turtle.next;
        // }
        // return turtle;
        // }

        // public boolean isPalindrome(ListNode head) {
        // if (head == null || head.next == null) {
        // return true;
        // }

        // ListNode middle = findMiddle(head);
        // ListNode secondHalfStart = reverse(middle.next);

        // ListNode firstHalfStart = head;
        // while(secondHalfStart != null) {
        // if(firstHalfStart.val != secondHalfStart.val) {
        // return false;
        // }
        // firstHalfStart = firstHalfStart.next;
        // secondHalfStart = secondHalfStart.next;
        // }

        // return true;
        // }
        // }

        // ques-3 https://leetcode.com/problems/linked-list-cycle/

        // /**
        // * Definition for singly-linked list.
        // * class ListNode {
        // * int val;
        // * ListNode next;
        // * ListNode(int x) {
        // * val = x;
        // * next = null;
        // * }
        // * }
        // */
        // public class Solution {
        // public boolean hasCycle(ListNode head) {
        // if(head==null) {
        // return false;
        // }
        // ListNode hare = head;
        // ListNode turtle = head;

        // while(hare != null && hare.next != null) {
        // hare = hare.next.next;
        // turtle = turtle.next;

        // if (hare == turtle) {
        // return true;
        // }
        // }
        // return false;
        // }
        // }
    }
}
