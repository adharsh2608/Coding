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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int remainder = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;
        while (l1 != null || l2 != null || remainder != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + remainder;
            remainder = sum / 10;
            sum = sum % 10; 
            l3.next = new ListNode(sum);
            l3 = l3.next; 
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next; 
    
    }
}