import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

    // Leetcode: https://leetcode.com/problems/product-of-array-except-self/
    static int[] productExceptSelff(int[] nums) {  //Brute force
        int[] result = new int[nums.length];
        for (int j = 0; j < nums.length ; j++) {
            result[j] = product(nums, j);
        }
        return result;
    }

    static int product(int[] nums, int self) {
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i != self) {
                product = product * nums[i];
            }
        }
        return product;
    }

    static int[] productExceptSelf(int[] nums) {  // Optimal solution
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int j = 1; j < nums.length ; j++) {
            result[j] = result[j - 1] * nums[j - 1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
    }
}