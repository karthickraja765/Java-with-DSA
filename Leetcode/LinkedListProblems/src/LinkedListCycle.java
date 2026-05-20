public class LinkedListCycle {

    // Leetcode: https://leetcode.com/problems/linked-list-cycle/description/
    // Asked in Amazon and Facebook

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // speed of slow: x times
            fast = fast.next.next; // speed of fast: 2x times

            if (slow == fast) { // if there is cycle, then the two pointers meet
                return true;
            }
        }
        return false;
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
