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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int sum = 0;
        while(head != null){
            if(head.val != 0){
                sum += head.val;
            }if(head.val == 0 && sum != 0){
                ListNode t = new ListNode(sum);
                sum = 0;
                cur.next = t;
                cur = cur.next;  
            }
            head = head.next;
        }
        return dummy.next;
    }
}