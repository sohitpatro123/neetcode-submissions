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
    public void reorderList(ListNode head) {
        if (head==null || head.next==null){
            return ;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev = null, curr = slow.next;
        slow.next=null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode first=head;
        ListNode second=prev;

        while (second!=null){
            ListNode tmp1=first.next;
            ListNode tmp2=second.next;
            first.next=second;
            second.next=tmp1;
            first=tmp1;
            second=tmp2;
            // tmp1=tmp1.next;
            // tmp2=tmp2.next;
        }        
    }
}
