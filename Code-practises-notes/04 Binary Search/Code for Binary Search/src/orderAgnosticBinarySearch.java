import java.util.Scanner;

// Ascending input: -18, -12, -5, 0, 2, 4, 6, 8, 11, 14, 17, 19, 25, 48, 67, 78
// Descending input: 234, 122, 98, 87, 66, 53, 43, 32, 21, 12, 7, 3, -14, -100

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -5, 0, 2, 4, 6, 8, 11, 14, 17, 19, 25, 48, 67, 78};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target number to be searched: ");
        int target = in.nextInt();
        int answer = orderAgnosticBS(arr, target);
        System.out.println("Number found at index " + answer);
    }

    static int orderAgnosticBS(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start+ (end - start) / 2);
            boolean isAscending = (arr[start] < arr[end]); // to check whether the sorted array is in ascending or descending!
            if(isAscending) { // If isAscending is true, then this code runs
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else { // If isAscending is false, then this code runs
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}