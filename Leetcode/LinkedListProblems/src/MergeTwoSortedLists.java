public class MergeTwoSortedLists {

    // Leetcode: https://leetcode.com/problems/merge-two-sorted-lists/description/

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
        ans is a dummy node.
        Why create a dummy node? Because inserting the first node into a linked list is usually annoying.
        You must handle head separately. Dummy node removes that special case.
        [ans(null) -> node1 -> node 2 -> ... so on.]

        */
        ListNode ans = new ListNode();
        ListNode lastElement = ans;

        while (list1 != null && list2 != null) { // continue until one list becomes empty
            if (list1.val < list2.val) {
                lastElement.next = list1;

                list1 = list1.next;
                lastElement = lastElement.next;
            } else {
                lastElement.next = list2;

                list2 = list2.next;
                lastElement = lastElement.next;
            }
        }
        // At this point. If there is any nodes remaining in any of the lists.
        // ofc they will be greater than all the nodes we've added. So add all the remaining nodes at last.
        if (list1 != null) {
            lastElement.next = list1;
        } else {
            lastElement.next = list2;
        }
//        lastElement.next = (list1 != null) ? list1 : list2; // you can also do it in a single line
        return ans.next; // ans is dummy node. Real merged list starts from ans.next
    }

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
