public class ReverseNodesInKGroup {

    // Asked in Amazon, Google, Facebook and Microsoft
    // Leetcode: https://leetcode.com/problems/reverse-nodes-in-k-group/description/

    public ListNode reverseKGroup(ListNode head, int k) { // similar to the ReverseBetween Code sample.
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while (true) {

            ListNode temp = current;
            int count = 0;
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }
            // base condition -> When there is less than k group then do nothing.
            if (count < k) break;

            ListNode last = previous;
            ListNode newEnd = current;

            // Reverse the list from left to right
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
            if (current == null) break;
            previous = newEnd;
        }
        return head;
    }

    public ListNode reverseKGroupFinal(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;

        while (true) {
            // Find kth node
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) {
                break;
            }
            ListNode groupNext = kth.next;

            // Reverse current group
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {
                ListNode temp = curr.next;

                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect reversed group
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
        return dummy.next;
    }

    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
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
