public class ReverseAlternateKGroups {
    // Asked in Google
    // https://www.geeksforgeeks.org/dsa/reverse-alternate-k-nodes-in-a-singly-linked-list/

    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode temp = current;
            int count = 0;
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }
            if (count < k) break;

            ListNode last = previous;
            ListNode newEnd = current;

            //Reverse the list from left to right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = previous;
                previous = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = previous;
            } else {
                head = previous;
            }
            newEnd.next = current;
            // Skip the K nodes
            for (int i = 0; current != null && i < k; i++) {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
