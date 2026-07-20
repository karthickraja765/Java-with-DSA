package RecursionArrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 1, 2, 5, 6};

//        Bubble(arr, arr.length - 1, 0);
//        System.out.println(Arrays.toString(arr));
//
//        Selection(arr, arr.length, 0 , 0);
//        System.out.println(Arrays.toString(arr));
//
//        int[] ans = Merge(arr);
//        System.out.println(Arrays.toString(ans));

        MergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort
    static void Bubble(int[] arr, int rowIndex, int colIndex) {
        if (rowIndex == 0) { // When rowIndex becomes 0, the array is fully sorted → recursion stops.
            return;
        }
        // colIndex represents the current comparison index (like inner loop) and
        // rowIndex represents the unsorted portion size (like outer loop)
        if (colIndex < rowIndex) {
            if (arr[colIndex] > arr[colIndex + 1]) { // This compares adjacent elements and swaps them if needed
                int temp = arr[colIndex];
                arr[colIndex] = arr[colIndex + 1];
                arr[colIndex + 1] = temp;
            }
            Bubble(arr, rowIndex, colIndex + 1); // Recursive call for moving to the next element.
        } else {
            Bubble(arr, rowIndex - 1, 0);
            /*
            When one full pass is done (colIndex == rowIndex):
            	•	The largest element is now at the end
            	•	Reduce problem size (rowIndex - 1)
            	•	Restart inner loop (colIndex = 0)
            */
        }
    }

    // Selection Sorting
    static void Selection(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) { // Current row
            if (arr[col] > arr[max]) { // assume that the 0th index is the max
                Selection(arr, row, col + 1, col); // updating the max
            } else {
                Selection(arr, row, col + 1, max);
            }
        } else { // once the max is being evaluated for the first pass, we now have max, So swap it
            int temp = arr[max];
            arr[max] = arr[row - 1]; // swaping with the Last index. That is Row - 1
            arr[row - 1] = temp;
            Selection(arr, row - 1, 0, 0); // recursion call for the next pass
        }
    }

    // Merge Sorting
    static int[] Merge(int[] arr) {
        if (arr.length == 1) { // If the Array has one element return it.
            return arr;
        }
        int mid = arr.length / 2; // Mid for separating by Arrays.copyOfRange & applying the merge sort for both.

        // divide the array by 2
        int[] left = Merge(Arrays.copyOfRange(arr, 0, mid)); //Left Array
        int[] right = Merge(Arrays.copyOfRange(arr, mid, arr.length)); //Right Array

        return MergeSorting(left, right); // helper function
    }

    static int[] MergeSorting(int[] firstArr, int[] secondArr) {
        int[] combinedArr = new int[firstArr.length + secondArr.length]; // Size of Left + Right Array.

        int i = 0; // Pointer for Left array
        int j = 0; // Pointer for Right array
        int k = 0; // Pointer for merged array

        while (i < firstArr.length && j < secondArr.length) { // both starting element is within the length range
            if (firstArr[i] < secondArr[j]) {
                combinedArr[k] = firstArr[i]; // Add the first array element
                i++; // Move to next
            } else {
                combinedArr[k] = secondArr[j]; // Add the second array element
                j++; // Move to next
            }
            k++; // Move to the next place in the merging array to store the next value
        }
        while (i < firstArr.length) { // It may be possible that one of the arrays is not complete or still has remaining elements. In that case, any one of the array condition will run
            combinedArr[k] = firstArr[i];
            i++;
            k++;
        }
        while (j < secondArr.length) {
            combinedArr[k] = secondArr[j];
            j++;
            k++;
        }
        return combinedArr;
    }

    // Merge Sorting in place (Without creating a copy and modifying the original one only)
    static void MergeSortInplace(int[] arr, int start, int end) {
        if (end - start == 1) { // When the subarray has only one element, it is already sorted → stop recursion.
            return;
        }
        int mid = start + (end - start) / 2;

        MergeSortInplace(arr, start, mid);
        MergeSortInplace(arr, mid, end);

        MergeSortIn(arr, start, end, mid); // helper function
    }

    static void MergeSortIn(int[] arr, int Start, int end, int mid) {
        int[] Combined = new int[end - Start]; // end - start is the total length of the array

        int i = Start; // Pointer for first half of the array
        int j = mid; // Pointer for second half of the array
        int k = 0; // Pointer for the same array itself

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                Combined[k] = arr[i];
                i++;
            } else {
                Combined[k] = arr[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the arrays is not complete or still has remaining elements,
        // In that case, any one of the array condition will run
        while (i < mid) {
            Combined[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            Combined[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < Combined.length; l++) { // Updating and Replace the original portion with the sorted values.
            arr[Start + l] = Combined[l];
        }
    }
}