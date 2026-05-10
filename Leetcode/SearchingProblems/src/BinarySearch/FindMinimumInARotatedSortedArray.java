package BinarySearch;

import java.util.Arrays;

public class FindMinimumInARotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMinFinal(nums));
    }


    static int findMin(int[] nums) {
        // This is a shortcut i learned to find minimum in a array. Time: o(n)
        int min = Arrays.stream(nums).min().getAsInt();
        return min;
    }

    static int findMinFinal(int[] nums) { // Using binary search. Time: o(log n)
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
        return nums[start]; // if the array is not rotated. Return the first element.
    }
}