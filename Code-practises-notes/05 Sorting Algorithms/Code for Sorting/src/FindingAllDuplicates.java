import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingAllDuplicates {

    // https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) { // we are checking pair wise instead of the correctInd = value - 1 concept
            if (nums[i] == nums[i + 1]) {
                result.add(nums[i + 1]);
            }
        }
        return result;
    }
}