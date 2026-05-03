import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] newshuffle = new int[2 * n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            newshuffle[index++] = nums[i];
            newshuffle[index++] = nums[n + i];
        }
        return newshuffle;
    }
}