import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

    }

    //Leetcode: https://leetcode.com/problems/3sum/description/
    public List<List<Integer>> threeSum(int[] nums) { // brute force solutions
        List<List<Integer>> Answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) { // time: o(n^3)
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]); // asList: This converts the given elements into a List view backed by an array.
//                        Instead, you can also do this manually like this.
//                        List<Integer> triplet = new ArrayList<>();
//                        triplet.add(nums[i]);
//                        triplet.add(nums[j]);
//                        triplet.add(nums[k]);
                        Collections.sort(triplet); // Collections.sort(): This sorts the list in-place in ascending order. I did this because of duplicate check later on.
                        if (!Answer.contains(triplet)) { // contains() checks in o(n) time :(
                            Answer.add(triplet);
                        }
                    }
                }
            }
        }
        return Answer;
    }

    public List<List<Integer>> threeSum1(int[] nums) { // again this is not the optimal solution. time: o (n^2)
        int n = nums.length;
        List<List<Integer>> Answer = new ArrayList<>();
        Arrays.sort(nums); // dual Pt sorting time: o(log n)

        for (int i = 0; i < n; i++) { // loop for n items. time: o(n)
            if (i > 0 && nums[i] == nums[i - 1]) { // skip the duplicate 'i'
                continue;
            }
            int low = i + 1;
            int high = n - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum < 0) {
                    low++;
                } else if (sum > 0) {
                    high--;
                } else {
                    Answer.add(Arrays.asList(nums[i], nums[low], nums[high]));


                    // skip the duplicates
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;

                    low++;
                    high--;
                }
            }
        }
        return Answer;
    }
}
