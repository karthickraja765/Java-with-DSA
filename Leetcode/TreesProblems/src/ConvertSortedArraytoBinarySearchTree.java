import java.util.ArrayList;

public class ConvertSortedArraytoBinarySearchTree {

    // Leetcode: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
    // Asked in facebook

    public TreeNode sortedArrayToBST(int[] nums) {
        return populateSorted(nums, 0, nums.length - 1);
    }

    private TreeNode populateSorted(int[] nums, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = populateSorted(nums, start, mid - 1);
        root.right = populateSorted(nums, mid + 1, end);

        return root;
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
