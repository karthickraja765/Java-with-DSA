package RecursionArrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 56, 23, 45, 87, 56, 87, 99, 32, 10};
        Sort(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // inBuilt quick sort method you can use.
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) { // when the subarray has 0 or 1 element → already sorted.
            return;
        }
        int start = startIndex;
        int end = endIndex;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid]; // here we can also pick the corner element or the middle element.
        while (start <= end) { // this loop rearranges elements around the pivot.
            while (arr[start] < pivot) { // loop runs till you find an element ≥ pivot
                start++;
            }
            while (arr[end] > pivot) { // stop when you find an element ≤ pivot
                end--;
            }
            // If the both condition is false, this will run
            if (start <= end) { //Swap with the end
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        // By now we have finished the 1st pass, 1st Pivot element will come in the correct position
        // We call the remaining left and right part of the array.(LHS of the Pivot(0 to end) and RHS of the pivot(start to arr.length -1))
        Sort(arr, startIndex, end);
        Sort(arr, start, endIndex);
    }
}