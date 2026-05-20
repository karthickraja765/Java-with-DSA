public class MiddleOfTheLinkedList {

    // Leetcode: https://leetcode.com/problems/middle-of-the-linked-list/?envType=problem-list-v2&envId=linked-list

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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