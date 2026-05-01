import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }

    // Leetcode: https://leetcode.com/problems/3sum/
    static List<List<Integer>> threeSum1(int[] nums) { //Brute force: not working
        List<List<Integer>> Answer = new ArrayList<>();

        for (int startnum = 0; startnum < nums.length; startnum++) {
            for (int j = startnum + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[startnum] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[startnum], nums[j], nums[k]);

                        Collections.sort(triplet);
                        if (!Answer.contains(triplet)) {
                            Answer.add(triplet);
                        }
                    }
                }
            }
        }
        return Answer;
    }

    static List<List<Integer>> threeSum(int[] nums) { //Optimal Solution: chatgpt
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) left++;
                else right--;
            }
        }
        return res;
    }
}