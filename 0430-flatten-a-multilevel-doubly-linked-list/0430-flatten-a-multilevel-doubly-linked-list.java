class Solution {

    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        flattenList(head);

        return head;
    }

    public Node flattenList(Node head) {

        Node curr = head;
        Node last = null;

        while (curr != null) {

            Node next = curr.next;

            // If child exists
            if (curr.child != null) {

                Node childHead = curr.child;

                // Flatten the child list and get its tail
                Node childTail = flattenList(childHead);

                // Connect curr -> childHead
                curr.next = childHead;
                childHead.prev = curr;

                // Remove child pointer
                curr.child = null;

                // Connect childTail -> original next
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                last = childTail;
                curr = childTail;
            } else {
                last = curr;
            }

            curr = curr.next;
        }

        return last;
    }
}