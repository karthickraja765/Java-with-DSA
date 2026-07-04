package src;

import java.util.Arrays;

public class SearchingIn2dArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {70,8,9},
        };
        int target = 8;

        int[] result = searchingIn2d(arr, target); // output should be the [row, col] indices of the target
        System.out.println(Arrays.toString(result));

        int maxResult = max(arr);
        System.out.println(maxResult);
    }

    static int[] searchingIn2d(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row, col}; // in order to return the [row, col] kinda array, we need to initialise it like this
                }
            }
        }
        return new int[] {-1,-1};
    }

    // finding max element in the 2d array
    static int max(int[][] arr) {
        int max = arr[0][0]; // You can do this too -> Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}