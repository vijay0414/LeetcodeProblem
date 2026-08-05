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
    public boolean isPalindrome(ListNode head) {
        // String str = "";
        // StringBuilder str1 = new StringBuilder();
        // while(head != null){
        //     str += String.valueOf(head.val);
        //     str1.append(String.valueOf(head.val));
        //     head = head.next;
        // }
        // String last = str1.reverse().toString();
        // return str.equals(last);

        //slow and Fast pointer
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode ri = reverse(slow);
        ListNode le = head;

        while(ri != null){
            if(ri.val != le.val) return false;
            ri = ri.next;
            le = le.next;
        }
        return true;
    }

    //Reverse
    public static ListNode reverse (ListNode head){
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}