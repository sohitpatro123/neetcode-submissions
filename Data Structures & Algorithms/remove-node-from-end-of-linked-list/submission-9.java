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
        //this is the third/best approach (O(L) vs [O(2L-n) for 2 pass] where L is length of list and n is the n that's given in the problem) - two pointers with a dummy node attached before head
        //but still, both second and third approach are O(n)
        //so still same big O efficiency
        //if struggling with approach 3, just use approach 2
        //and while both apporach 2 and 3 share the same asymptotic complexity, Approach 3 is faster in practice due to smaller constant factor or fewer operations
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
