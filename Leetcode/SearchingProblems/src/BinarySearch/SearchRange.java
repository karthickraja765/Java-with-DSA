package BinarySearch;

public class SearchRange {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        /*
        -> basic way instead of if statement below.
        int start = searchRange(nums, target, true);
        int end = searchRange(nums, target, false);
        int ans[0] = start;
        int ans[1] = end;
        return ans;
        */
        ans[0] = seaching(nums, target, true);
        if (ans[0]!= -1) {
            ans[1] = seaching(nums, target, false);
        }
        return ans;
    }
    static int seaching(int [] nums, int target, boolean Firstoccuranceindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int middle = start + (end - start ) / 2;
            if (nums[middle] > target) {
                end = middle - 1;
            }
            else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                ans = middle;
                if (Firstoccuranceindex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}