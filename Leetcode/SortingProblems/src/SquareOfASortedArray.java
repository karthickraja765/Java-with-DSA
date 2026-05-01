import java.util.Arrays;

public class SquareOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }

    // Leetcode: https://leetcode.com/problems/squares-of-a-sorted-array/
    static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
