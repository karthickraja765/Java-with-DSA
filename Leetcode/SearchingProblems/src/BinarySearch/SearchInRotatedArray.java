package BinarySearch;

public class SearchInRotatedArray {

    // Leetcode: https://leetcode.com/problems/search-in-rotated-sorted-array/description/

    static int pivotsearch(int[] arr, int target) {
        int pivot = findpivot(arr);

        // if pivot is not found, it means the array is not rotated
        if(pivot == -1) {
            // just do normal binary search.
            return Binarysearch(arr, target, 0, arr.length-1);
        }
        // if pivot is found, it means it is rotated, and it has to 2 Ascending arrays.
        if(arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return Binarysearch(arr, target, 0 , pivot-1);
        }
        return Binarysearch(arr, target, pivot + 1, arr.length - 1);
    }

    // this code will not work with duplicate values in the arrays
    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // there are 4 cases to find the pivot element
            // case1:
            // what if the middle element is in the last position? mid+1 has no element. Hence, it will give Java index-out-of-bounds error.
            // so add this to the if statement.
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case2:
            // what if the middle element is in the first position? mid-1 has no element. Hence, it will give Java index-out-of-bounds error.
            // so add this to the if statement.
            if(mid > start && arr[mid] < arr[mid -1]) {
                return mid -1;
            }
            // case3&4;
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid+ 1;
            }
        }
        return -1;
    }

    static int Binarysearch( int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}