import java.util.Scanner;

// The ceiling of the number is the smallest element in the array that is greater than or equal to the target element.

public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int target = in.nextInt();
        int result = ceiling(arr, target);
        System.out.println("The ceiling number is in the index "+result);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length-1]) { // But what if the target element is > than the largest element in the array.
            System.out.println("Target is greater than the greatest number in the array!");
            return -1;
        }

        while (start <= end) {
            int mid = start + end / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // if the mid is the answer then it returns the ans.
            }
        }
        return start;
    }
}