public class ValidBinarySearchTree {

    // https://leetcode.com/problems/validate-binary-search-tree/description/
    // asked in google, amazon

    public boolean isValidBST(TreeNode root) { // time and space: o(n)
        return helper(root, null, null);
    }

    boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) return true;

        // following pre-order
        if (low != null && node.val <= low) {
            return false;
        }
        if (high != null && node.val >= high) {
            return false;
        }

        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;
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
