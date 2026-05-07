import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) { // Time: o(n log n)
        Arrays.sort(nums); // sorting time cost: o(n log n)
        for (int i = 0; i < nums.length - 1; i++) { // time for traversing: o(n)
            if (nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }


    // Hashset: If element already exists → duplicate found. Else add it
    // Why hash set?
    // Ans: Hash look up is o(1) and traversal for adding the unique elements is o(n)

    public boolean containsDuplicatefinal(int[] nums) { // time: o(n)
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
