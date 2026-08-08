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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        // return prev;
        ListNode temp = prev;
        while(temp != null && temp.next != null){
            if(temp.next.val < temp.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        ListNode rprev = null;
        ListNode rcur = prev;
        while(rcur != null){
            ListNode rnext = rcur.next;
            rcur.next = rprev;
            rprev = rcur;
            rcur = rnext;
        }
        return rprev;
    }
}