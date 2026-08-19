/**
 * Definition for singly-linked list.
 * class ListNode {
 * public int val;
 * public ListNode next;
 * ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode left = head;
        ListNode right = head.next;
        ListNode prev = left;
        while (right != null) {
            if (left.val == right.val) {
                while (right != null && left.val == right.val) {
                    right = right.next;
                }
                if (left == head) {
                    head = right;
                    left = right;
                    if (right != null){
                        right = right.next;}
                    else {
                        prev.next = right;
                        left = right;}
                } 
                else {
                    prev.next = right;
                    left = right;
                    if (right!= null)
                        right = right.next;
                }
            } else {
                right = right.next;
                prev = left;
                left = left.next;
            }
        }
        return head;
    }
}
