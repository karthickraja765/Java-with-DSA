import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray { //Brute force
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    static int removeDuplicates(int[] nums) {
       if (nums.length == 0) {
           return 0;
       }
       int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // If a new (unique) element is found:
                i++;
                nums[i] = nums[j]; //Move i forward and Place the new unique element at position i
            }
        }
        return i + 1;
    }
}