import java.util.Arrays;

public class FindKthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }

    // Leetcode: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
    //This code is not actually correct, because we need to find a solution without any sorting methods.
    //This is concept related to heap and priority queue
    static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
