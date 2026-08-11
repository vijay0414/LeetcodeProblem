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
// class Solution {
//     public ListNode doubleIt(ListNode head) {
//         int n = 0;
//         ListNode temp = head;
//         while(temp != null){
//             int m = temp.val;
//             n = n * 10 + m;
//             temp = temp.next;
//         }
//         int mul = n * 2;
//          if (mul == 0) {
//             return new ListNode(0);
//         }
//         ListNode dummy = new ListNode(0);
//         ListNode cur = dummy;
//         int c = count(mul) - 1;
//         System.out.println(c);
//         while(c >= 0){
//             int power = (int) Math.pow(10, c);
//             int d = mul / power;
//             mul %= power;

//             cur.next = new ListNode(d);
//             cur = cur.next;
//             c--;
//         }
        
//         return dummy.next;
//     }
//     public int count(int m){
//         int c = 0; 
//         while(m != 0){
//             c++;
//             m /= 10;
//         }
//         return c;
//     }
// }

class Solution {
    public ListNode doubleIt(ListNode head) {
        if (head.val >= 5) {
            head = new ListNode(0, head);
        }
        ListNode curr = head;
        while (curr != null) {
            int doubled = curr.val * 2;
            if (curr.next != null && curr.next.val >= 5) {
                doubled += 1;
            }

            curr.val = doubled % 10;
            curr = curr.next;
        }

        return head;
    }
}