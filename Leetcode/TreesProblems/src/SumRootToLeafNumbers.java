public class SumRootToLeafNumbers {

    // https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    int helper(TreeNode root, int sum) { // time : o(n) and space: worst-case o(n)
        if (root == null) return 0;

        // calculate sum for each node
        sum = sum * 10 + root.val;

        // if it is a leaf node
        if (root.left == null & root.right == null) {
            return sum;
        }
        return helper(root.left, sum) + helper(root.right, sum);
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
