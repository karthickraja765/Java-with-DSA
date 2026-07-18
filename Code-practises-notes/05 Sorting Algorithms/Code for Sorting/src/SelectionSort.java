import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int MaxIndex = getMaxIndex(arr, 0, last); // find the max value in the array
            swap(arr, MaxIndex, last); // swap it with the last particular index
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        // finding max value in the array.
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;  // we are returning only the index number.
            }
        }
        return max;
    }
}