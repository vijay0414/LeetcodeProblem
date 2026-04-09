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
    public ListNode middleNode(ListNode head) {
        ListNode t=head;
        int c=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        int in=c/2;
        ListNode ans=head;
        for(int i=1;i<=in;i++){
            ans=ans.next;
        }
        return ans;
    }
}