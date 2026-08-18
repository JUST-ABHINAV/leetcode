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
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null)return head;
        ListNode left=head;
        ListNode right=head.next;
        while(right!=null){
            while (right!=null && left.val==right.val){
                right=right.next;
            }
            left.next=right;
            left=left.next;
            if (right!=null){
            right=right.next;}
        }
        return head; 
    }
}