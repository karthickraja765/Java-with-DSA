public class ReverseLinkedList2 {

    // Asked in Google, Microsoft, Facebook
    // Leetcode: https://leetcode.com/problems/reverse-linked-list-ii/description/?envType=problem-list-v2&envId=linked-list

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) { // edge case
            return head;
        }
        // Skip the first left-1 nodes
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            previous = current;
            current = current.next;
        }
        ListNode last = previous;
        ListNode newEnd = current;

        // Reverse the list from left to right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
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
