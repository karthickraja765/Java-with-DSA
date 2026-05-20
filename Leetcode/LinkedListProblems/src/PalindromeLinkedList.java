public class PalindromeLinkedList {

    // Leetcode: https://leetcode.com/problems/palindrome-linked-list/description/?envType=problem-list-v2&envId=linked-list
    // Asked in Amazon, Google, Apple, Microsoft

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head); // Reminder: finding middleNode, we solved in cycle detection.
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond; // Why store this? Because later you want to restore the original list. If you don’t save it, you lose the starting point of reversed second half after traversal.

        // compare both halves
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            // if the values are same, move both forward
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);
        /*
        Why?
        Because reversing second half modified the original structure.
        Good interview practice: avoid permanently modifying input unless asked.
        */

        /*
        If palindrome:
        comparison loop finishes naturally, one pointer reaches null

        If mis-match:
        loop breaks early, both pointers still non-null
        */
        if (head == null || headSecond == null) {
            return true;
        } else {
            return false;
        }
    }

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
