import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum { //Brute force solution
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 5, 7, 9};
        int target = 13;
        int[] ans = twoSumHashTable(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    // Leetcode: https://leetcode.com/problems/two-sum/
    // This problem can be also using hashtable also

    static int[] twoSum(int[] nums, int target) { // time complexity: o(n^2)
        for (int start = 0; start < nums.length; start++) {
            for (int element = start + 1; element < nums.length; element++) {
                if (nums[start] + nums[element] == target) {
                    return new int[] {start, element};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // This is the hashmap method of solving 2Sum
    public static int[] twoSumHashTable(int[] numbers, int target) {
        // Avg time complexity: o(n)
        // and Worst case: O(n²) This happens if many hash collisions occur.

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int key = numbers[i];
            if (map.containsKey(target - key)) { // checking. time: o(1)
                return new int[] { map.get(target - key), i}; // // getting value. time: o(1)
            }
            map.put(key, i); // (key, value)
        }
        return new int[]{-1, -1};
    }
}