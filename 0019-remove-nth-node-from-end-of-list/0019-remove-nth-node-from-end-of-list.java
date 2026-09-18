class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;

       
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        
        if (length == n) {
            return head.next;
        }

       
        int steps = length - n;
        temp = head;

        for (int i = 1; i < steps; i++) {
            temp = temp.next;
        }

       
        temp.next = temp.next.next;

        return head;
    }
}