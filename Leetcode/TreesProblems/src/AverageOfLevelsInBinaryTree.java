import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    // Leetcode: https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
    // Asked in google

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>(); // outer list

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double averageLevel = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                averageLevel += currNode.val;

                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
            averageLevel = averageLevel / levelSize;
            result.add(averageLevel);
        }
        return result;
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
