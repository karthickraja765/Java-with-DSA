public class FlattenBinaryTreeToLinkedList {

    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/2016357714/
    // Asked in facebook

    public void flatten(TreeNode root) {
         TreeNode curr = root;

         while (curr != null) {
             // find the right most subtree on the left child of the node, you are currently at
             if (curr.left != null) {
                 // find the right most node, so that the right child nodes from you are currently at goes there
                 TreeNode temp = curr.left;
                 // using a temp pointer, moving forward till I find that last node
                 while (temp.right != null) {
                     temp = temp.right;
                 }
                 // After finding that last node, I will join the curr's right nodes to the temp's right.
                 // This way, tree maintains the right-right kind of manner and left is always null
                 temp.right = curr.right;
                 // change the left node you're currently at, to the right.
                 curr.right = curr.left;
                 curr.left = null;
             }
             // move forward towards right. Because of N -> L -> R (pre-order)
             curr = curr.right;
         }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
