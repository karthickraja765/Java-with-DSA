package RecursionArrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 2;
        int ans = RotatedBS(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    // Here in case of recursion we don't have to find the pivot and search accordingly, Instead, we can do something like this!
    static int RotatedBS(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        // Case 1:
        if(arr[start] < arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return RotatedBS(arr, target, start, mid - 1);
            } else {
                return RotatedBS(arr, target, mid + 1, end);
            }
        }
        // Case 2:
        if(target >= arr[mid] && target <= arr[end]) {
            return RotatedBS(arr, target, mid + 1, end);
        } else {
            return RotatedBS(arr, target, start, mid - 1);
        }
    }
}