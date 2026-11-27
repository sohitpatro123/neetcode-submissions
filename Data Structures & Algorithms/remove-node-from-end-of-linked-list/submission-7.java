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
        //brute force=arraylist
        //another approach: go through the list, find list size
        //remove element from the last node, now that you know last node's index
        //this is the third approach - two pointers with a dummy node attached before head
        ListNode temp = new ListNode(-1);
        temp.next=head;
        ListNode right = head;
        ListNode left = temp;
        for (int i=0; i<n; i++){
            right=right.next;
        }
        while (right!=null){
            left=left.next;
            right=right.next;
        }
        left.next=left.next.next;
        return temp.next;


    }
}
