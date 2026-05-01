import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    // Asked in Amazon
    // Leetcode: https://leetcode.com/problems/missing-number/description/
    static int missingNumber(int[] nums) { // Brute force. Shortcut.
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumberManual(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums,int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public int missingNumber1(int[] nums) { //
        Arrays.sort(nums); // Dual Quick Sort
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
}