
public class NextGreatestElement2 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(nextGreaterElement(n));
    }

    // Leetcode: https://leetcode.com/problems/next-greater-element-iii/description/

    public static int nextGreaterElement(int n) { // Optimal solution
        char[] arr = String.valueOf(n).toCharArray();

        // Step 1: find first decreasing element
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) return -1;

        // Step 2: find next greater element
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Step 4: reverse right side
        reverse(arr, i + 1, arr.length - 1);

        long result = Long.parseLong(new String(arr));

        return result > Integer.MAX_VALUE ? -1 : (int) result;
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
