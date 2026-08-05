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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        while(head != null){
            int n = head.val;
            map.put(n,map.getOrDefault(n,0)+1);
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for(int i : map.keySet()){
            int v = map.get(i);
            if(v == 1){
                cur.next = new ListNode(i);
                cur = cur.next; 
            }
        }
        return dummy.next;
    }
}