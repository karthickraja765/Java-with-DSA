package BinarySearch;

public class FindMinimumInARotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                // Minimum is in right half
                start = mid + 1;
            } else {
                // Minimum is in left half (including mid)
                end = mid;
            }
        }
        return nums[start];
    }
}