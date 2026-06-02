import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessorOfANode {


    // gfg: https://www.geeksforgeeks.org/dsa/level-order-successor-of-a-node-in-binary-tree/
    // Asked in google

    public TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();

                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }

                if (currNode.val == key) {
                    break;
                }
            }
        }
        return queue.peek();
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
