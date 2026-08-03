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
        String str = "";
        StringBuilder str1 = new StringBuilder();
        while(head != null){
            str += String.valueOf(head.val);
            str1.append(String.valueOf(head.val));
            head = head.next;
        }
        String last = str1.reverse().toString();
        return str.equals(last);
    }
}