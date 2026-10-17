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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode ptr = head;
        ListNode ptr1 = head.next.next;
        while(ptr1 != null && ptr1.next != null){
            ptr = ptr.next;
            ptr1 = ptr1.next.next;
        }
        ptr.next = ptr.next.next;
        return head;
    }
}