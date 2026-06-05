public class DiameterOfBinaryTree {
    // https://leetcode.com/problems/diameter-of-binary-tree/description/
    // Asked in google, facebook and Amazon

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    int height(TreeNode node) {
        if (node == null) return 0; // base condition

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int diam = leftHeight + rightHeight + 1 ;
        diameter = Math.max(diameter, diam);

        return Math.max(leftHeight,rightHeight) + 1;
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
