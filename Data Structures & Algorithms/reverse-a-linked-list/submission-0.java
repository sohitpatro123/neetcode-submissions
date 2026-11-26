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
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode curr=head.next;
        ListNode currNext=curr.next;
        ListNode prev=head;
        while (curr!=null){
            curr.next=prev;
            prev=curr;
            curr=currNext;
            if (currNext!=null){
            currNext=currNext.next;
            }
        }
        head.next=null;
        return prev;

        
    }
}
