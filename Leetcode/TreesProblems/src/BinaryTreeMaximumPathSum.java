public class BinaryTreeMaximumPathSum {

    // https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) { // time and space: o(n)
        helper(root);
        return ans;
    }

    int helper(TreeNode node) {
        if (node == null) return 0;

        int left = helper(node.left);
        int right = helper(node.right);

        // if left or right is -ve, make it zero. Because taking the -ve values reduces our overall answer.
        left = Math.max(0, left);
        right = Math.max(0, right);

        int pathSum = left + right + node.val;

        ans = Math.max(pathSum, ans);

        return Math.max(left, right) + node.val;
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
