public class SearchInRotatedArrayWithDuplicates {

    // This code is the rare case for the https://leetcode.com/problems/search-in-rotated-sorted-array/description/

    static int pivotSearch(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if pivot is not found, it means the array is not rotated. Just do normal binary search.
        if(pivot == -1) {
            return BinarySearch(arr, target, 0, arr.length-1);
        }

        // if pivot is found, it means it is rotated. It has to 2 Ascending arrays.
        if(arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return BinarySearch(arr, target, 0 , pivot-1);
        }
        return BinarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    // this code will  work with duplicate values in the arrays
    static int findPivot(int[] arr) {
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
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid -1;
            }

            // This is main check for removing the duplicates : if element at middle, start, end are equal.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates.
                // if the duplicates is a pivot element. check the start or end is a pivot.
                // check the start is a pivot or not.
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                } else {
                    start++;
                }
                // check the start is a pivot or not.
                if (end > start && arr[end] > arr[end - 1]) {
                    return end;
                } else {
                    end--;
                }
            }
            // this is part is a bit of confusion.
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}