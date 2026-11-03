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
// import java.util.ArrayDeque;
// import java.util.Deque;

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         Deque<Integer> s1 = new ArrayDeque<>();
//         Deque<Integer> s2 = new ArrayDeque<>();

//         while (l1 != null) {
//             s1.push(l1.val);
//             l1 = l1.next;
//         }

//         while (l2 != null) {
//             s2.push(l2.val);
//             l2 = l2.next;
//         }

//         int carry = 0;
//         ListNode head = null;

//         while (!s1.isEmpty() || !s2.isEmpty() || carry > 0) {
//             int sum = carry;

//             if (!s1.isEmpty()) {
//                 sum += s1.pop();
//             }

//             if (!s2.isEmpty()) {
//                 sum += s2.pop();
//             }

//             carry = sum / 10;

//             ListNode node = new ListNode(sum % 10);
//             node.next = head;
//             head = node;
//         }

//         return head;
//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return dummy.next;
    }
}