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
    public int pairSum(ListNode head) {
       if(head == null) return 0;

       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
       } 
       ListNode right = reverse(slow);
       ListNode left = head;
       int max = 0;
       while(right != null){
            int sum = left.val + right.val;
            max = Math.max(max,sum);
            left = left.next;
            right = right.next;
       }
       return max;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}