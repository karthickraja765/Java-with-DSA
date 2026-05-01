public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));
    }

    // Leetcode: https://leetcode.com/problems/majority-element/
    static int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                majority = nums[i];
            }
            if (nums[i] == majority) {
                count = count + 1;
            }
            else {
                count--;
            }
        }
        return majority;
    }
}
