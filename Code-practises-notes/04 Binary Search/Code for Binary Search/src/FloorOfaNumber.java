import java.util.Scanner;

// The floor of the number is the largest element in the array that is smaller than or equal to the target element.

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int target = in.nextInt();
        int result = floor(arr, target);
        System.out.println("The ceiled number is in the index " + result);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length-1]) { // But what if the target element is < than the smallest element in the array.
            System.out.println("Target is smaller than the smallest number in the array!");
            return -1;
        }

        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}