public class FindingDuplicates {

    // https://leetcode.com/problems/find-the-duplicate-number/
    // Asked in Amazon

    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if (nums[i] != i + 1) {
                int correctindex = nums[i] - 1;
                if (nums[i] != nums[correctindex]) {
                    swap(nums, i, correctindex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int firstVal, int secondVal) {
        int temp = arr[firstVal];
        arr[firstVal] = arr[secondVal];
        arr[secondVal] = temp;
    }
}