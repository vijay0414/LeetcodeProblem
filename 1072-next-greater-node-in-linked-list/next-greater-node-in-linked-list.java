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
    public int[] nextLargerNodes(ListNode head) {
        if(head == null) return new int[]{};
        ListNode cur = head;
        int c = 0;
        while(cur != null){
            c++;
            cur = cur.next;
        }
        int[] arr = new int[c];

        ListNode temp = head;
        int i = 0;
        while(temp != null && temp.next != null){
            int max = temp.val;
            ListNode m = temp.next;
            boolean f = false;
            while(m != null){
                if(m.val > max){
                    f = true;
                    arr[i++] = m.val;
                    break;
                }
                m = m.next;
            }
            if(!f) arr[i++] = 0; 
            temp = temp.next;
        }
        return arr;
    }
}