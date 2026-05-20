public class ReorderList {

    // Leetcode: https://leetcode.com/problems/reorder-list/description/?envType=problem-list-v2&envId=linked-list
    // Asked in google and Facebook

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) { // Leetcode 206
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;  // safe
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null && head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;

        // Rearranging
        while (headFirst != null && headSecond.next != null) {
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        if (headFirst != null) { //Setting next of tail to null
            headFirst.next = null;
        }
    }

    public void reorderListFinal(ListNode head) { // optimal solution
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; // break the list

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // prev = head of reversed second half

        // Step 3: Merge two halves
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
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
