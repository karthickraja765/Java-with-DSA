public class KthSmallestElementInABST {

    // https://leetcode.com/problems/kth-smallest-element-in-a-bst/
    // asked in facebook, amazon and google

    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
          return helper(root, k).val;
    }
    public TreeNode helper(TreeNode node, int k) {
        if (node == null) return null;

        TreeNode left = helper(node.left, k);

        // once the recursion call reaches the last node, check...and increase counter one by one until the K limit is reached.
        if (left != null) return left;
        count++;

        if (count == k) return node;

        // if the left and the node is done traversing, move to right
        return helper(node.right, k);
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
