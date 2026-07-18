import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr) {
        boolean swapped;
        // Outer loop for the number of passes
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // Inner loop for comparing adjacent elements
            // We subtract 'i' because the last 'i' elements are already sorted
            for (int j = 1; j < arr.length - i; j++) {
                // Compare the actual values in the array
                if (arr[j - 1] > arr[j]) {
                    // Swap the elements
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) { // !false = true
                break;
            }
        }
    }
}