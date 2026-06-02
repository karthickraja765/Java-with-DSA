import java.util.Arrays;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    // https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
    // Repeated amazon question

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;

        int rootNode = preorder[0];
        int index = 0;

        // find the index of the root node in inorder
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootNode) {
                index = i;
            }
        }
        TreeNode node = new TreeNode(rootNode);

        node.left = buildTree(Arrays.copyOfRange(preorder,1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return node;
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
