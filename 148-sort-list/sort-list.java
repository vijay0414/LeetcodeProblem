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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        ListNode cur = new ListNode(0);
        ListNode n = cur;
        Collections.sort(list);
        for(int i : list){
            ListNode c = new ListNode(i);
            n.next = c;
            n = n.next;
        }
        return cur.next;
    }
}