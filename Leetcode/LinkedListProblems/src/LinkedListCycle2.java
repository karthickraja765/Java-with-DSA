public class LinkedListCycle2 {

    // Asked in Amazon and Facebook
    // Leetcode: https://leetcode.com/problems/linked-list-cycle-ii/description/

    public int CycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // calculate the length of cycle.
                int length = 0;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                }
                while (temp != fast);
                return length;
            }
        }
        return -1;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int length = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                length = CycleLength(slow);
                break;
            }
        }
        if (length == 0) return null;

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }
        // keep moving the f and s pointer till they meet
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
