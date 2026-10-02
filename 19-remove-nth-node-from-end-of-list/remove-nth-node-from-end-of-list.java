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
        ListNode ptr = head;
        ListNode ptr1 = head;
        for(int i = 0; i < n; i++){
            ptr = ptr.next;
        }
        if(ptr == null){
            return head.next;
        }
        while(ptr.next != null){
            ptr = ptr.next;
            ptr1 = ptr1.next;
        }
        ptr1.next = ptr1.next.next;
        return head;
    }
}