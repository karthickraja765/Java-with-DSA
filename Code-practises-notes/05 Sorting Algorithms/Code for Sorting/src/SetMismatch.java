public class SetMismatch {

    // https://leetcode.com/problems/set-mismatch/description/

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i] + 1;
            if (nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            }
            else {
                i++;
            }
        }
        //find the missing number.
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return new int[] {nums[index] , index + 1};
            }
        }
        return new int[]{-1,-1};
    }

    void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
