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
class Solution {
    // public static int gcd(int a, int b){
    // if(a>b){
    // for(int i = b; i > 0; i--){
    // if(a % i == 0 && b % i == 0){
    // return i;
    // }
    // }
    // }
    // else {
    // for(int i = a; i > 0; i--){
    // if(a % i == 0 && b % i == 0){
    // return i;
    // }
    // }
    // }
    // return -1;
    // }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode curr2 = head.next;

        while (curr2 != null) {
            ListNode res = new ListNode(gcd(curr.val, curr2.val));

            curr.next = res;
            res.next = curr2;

            curr = curr2;
            curr2 = curr2.next;
        }
        return head;
    }
}