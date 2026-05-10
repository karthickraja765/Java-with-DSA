package BinarySearch;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }

    // Leetcode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[] {start, end};
            }else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}