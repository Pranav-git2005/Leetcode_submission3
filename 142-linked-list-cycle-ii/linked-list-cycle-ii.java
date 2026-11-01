/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(entry!=slow){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;

        // ListNode fast=head;
        // ListNode slow=head;
        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        //     if(slow==fast){
        //         slow=head;
        //         while(slow!=fast){
        //             slow=slow.next;
        //             fast=fast.next;
        //         }
        //         return slow;
        //     }
        // }
        // return null;
    }
}
