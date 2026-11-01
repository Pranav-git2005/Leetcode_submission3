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
    public int getDecimalValue(ListNode head) {
        int x=0;
        while(head!=null){
            x=x*2+head.val;
            head=head.next;
        }
        return x;
        // ListNode fast = head;
        // int count = 0;
        // ListNode num = head;
        // double sum=0;
        // while(fast !=null){
        //     count++;
        //     fast = fast.next;
        // }
        // int power = count-1;
        // while(num !=null){
        //     double a = Math.pow(2,power);
        //     sum += num.val * (int) Math.round(Math.pow(2, power));
        //     power --;
        //     num = num.next;
        // }
        // return (int)sum;

    }
}
