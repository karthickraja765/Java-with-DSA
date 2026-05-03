public class FindMinimumInRotatedArray {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public int findMinBasic(int[] nums) { // time: o(n)
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int findMin(int[] nums) { // brute force approach 1
        for (int i = 0; i < nums.length - 1; i++) { // linear time. but Worst case: o(n)
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return nums[0]; // array not rotated
    }

    public int findMin1(int[] nums) { // optimal solution using binary search. time: 0(log n) and space: 0(1)
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1; // search on right
            } else {
                end= mid; // search on left
            }
        }
        return nums[start];
    }
}
