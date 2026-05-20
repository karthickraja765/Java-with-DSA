public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    // In-place Reversing of the LinkedList with Iteration. Asked in Google, Apple, Amazon, Meta.
    // https://leetcode.com/problems/reverse-linked-list/

    public ListNode reverseList(ListNode head) { // time cost: o(n)
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;  // safe when you declare it inside
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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

