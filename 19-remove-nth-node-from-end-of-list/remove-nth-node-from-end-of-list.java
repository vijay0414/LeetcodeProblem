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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 0 ;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode temp = head;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        int pos = c - n ;
        int m = 0;
        while(m < pos){
            cur = cur.next;
            m++;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
}