import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {123, 234, 345, 456, 567, 678, 789, 890, 900};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be searched:");
        int target = in.nextInt();
        int ans = BS_using_recursion(arr, target, 0 , arr.length);
        System.out.println("Index of the target: "+ ans);
    }

    static int BS_using_recursion(int[] arr, int target, int start, int end) {
        if (start > end) { // Base condition
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(target == arr[mid]) {
            return mid;
        }
        if(target < arr[mid]) {
            // Tip: Make sure to return the result of a func call, of the return type.
            // If there is a Return type int, make sure you return it.
            return BS_using_recursion(arr, target, 0, mid - 1);
        }
        return BS_using_recursion(arr, target, mid + 1, end);
    }
}