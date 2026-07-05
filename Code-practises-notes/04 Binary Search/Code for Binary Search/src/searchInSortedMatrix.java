import java.util.Arrays;

public class searchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(arr, 12)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] {row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length; // 0th row's length

        if (columns == 0) { // If columns are empty
            return new int[] {-1, -1};
        }
        if (rows == 1) { // If there is a single row then do Binary Search on the row from cStart to cEnd
            return binarySearch(matrix, 0, 0, columns - 1, target);
        }

        // perform Binary Search on middle column
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = columns / 2;

        while (rStart < (rEnd - 1)) { // Run the loop until the required rows only remain.
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid; // Ignoring the above rows
            } else {
                rEnd = mid; // Ignoring the below rows
            }
        }
        // Now that there is 2 rows remaining, Using B.S, We need to Check the target is in the middle column, if the target is not found.
        // 4 parts are divided and perform B.S on all 4 parts.
        if (matrix[rStart][cMid] == target) { // Case1, Checking the target in the middle column.
            return new int[] {rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] {rStart+1, cMid};
        }
        if (target <= matrix[rStart][cMid-1]) { // Case2, Checking the top left part.
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][columns-1]) { // Case3, Checking the top right part.
            return binarySearch(matrix, rStart, cMid+1, columns-1, target);
        }
        if (target < matrix[rStart+1][cMid-1]) { // Case4 & 5, Checking the bottom left and bottom right parts.
            return binarySearch(matrix, rStart+1,0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart+1,cMid-1, columns-1, target);
        }
    }
}