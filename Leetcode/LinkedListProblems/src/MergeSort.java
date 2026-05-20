public class MergeSort {

    // question 1: Using Merge Sort
    // https://leetcode.com/problems/sort-list/

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) { // If list is empty or list has only 1 node -> already sorted -> return it.
            return head;
        }
        ListNode mid = GetMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode currentnode = ans;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentnode.next = list1;
                list1 = list1.next;
                currentnode = currentnode.next;
            } else {
                currentnode.next = list2;
                list2 = list2.next;
                currentnode = currentnode.next;
            }
        }
        currentnode.next = (list1 != null) ? list1 : list2; // If the condition is true lastElements.next is equal to list1, else list2.
        return ans.next;
    }

    public ListNode GetMid(ListNode head) {
        ListNode MidPrev = null;

        while (head != null && head.next != null) {
            // MidPrev moves 1 step
            // head moves 2 steps
            MidPrev = (MidPrev == null) ? head : MidPrev.next;
            head = head.next.next;
            // when head pointer reaches end
            // MidPrev reaches midpoint previous node
        }
        ListNode mid  = MidPrev.next;
        MidPrev.next = null;
        return mid;
    }

    // ListNode class
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}