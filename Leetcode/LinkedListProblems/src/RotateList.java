public class RotateList {

    // Leetcode: https://leetcode.com/problems/rotate-list/description/?envType=problem-list-v2&envId=linked-list
    // Asked in Facebook, Google, Twitter

    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head != null || head.next != null) {
            return head;
        }
        // find the length of the list
        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }
        last.next = head;
        int rotations = k % length; // this line is important for rotations more than the length of the list
        int skip = length - rotations;

        // locate the new last
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        // update the head
        head = newLast.next;
        newLast.next = null;

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
