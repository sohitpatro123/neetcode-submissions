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
        List<ListNode> arr = new ArrayList<>();
        ListNode curr=head;
        while (curr!=null){
            arr.add(curr);  
            curr=curr.next;          
        }
        if (arr.size()<=1) return null;
        if (arr.size()==n) 
        {
             head=head.next;
        }
        else{
            arr.get(arr.size()-n-1).next=arr.get(arr.size()-n).next;
        }
        return head;


    }
}
