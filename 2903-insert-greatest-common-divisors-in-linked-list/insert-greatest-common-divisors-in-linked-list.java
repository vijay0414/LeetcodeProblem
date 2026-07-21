/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next != null){
            int a = temp.val;
            int b = temp.next.val;
            int gcdof = gcd(a,b);
            ListNode newnode = new ListNode(gcdof);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = newnode.next;
        }
        return head;
    }
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b , a % b);
    }
}