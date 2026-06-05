public class InvertBinaryTree {

    // Leetcode: https://leetcode.com/problems/invert-binary-tree/description/
    // asked in google

    public TreeNode invertTree(TreeNode root) { // time and space: o(n)
        if (root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    /*
    1. (*)Space complexity that the recursion stack takes is the height of the tree.
    2. Recursion stack contains each level's nodes once.
    3. That's why cost of space is o(log n)
     */


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
