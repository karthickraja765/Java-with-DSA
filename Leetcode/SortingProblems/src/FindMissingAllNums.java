import java.util.Arrays;

public class FindMissingAllNums {

    // Leetcode: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    // Asked in google

    public static int[] findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        return nums;

//        // just find missing numbers
//        List<Integer> ans = new ArrayList<>();
//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] != index + 1) {
//                ans.add(index + 1);
//            }
//        }
//        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] ans = findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(ans));
    }
}
