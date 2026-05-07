
public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        int[][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0}
        };
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }

    // Leetcode: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            boolean same = true; // Assume matrices are equal initially.
            //Checking mat and target are equal or not
            for (int j = 0; j < mat.length; j++) {
                for (int k = 0; k < mat[0].length; k++) {
                    if (mat[j][k] != target[j][k]) {
                        same = false;
                        break;
                    }
                }
                if (!same) {
                    break;
                }
            }
            if (same) return true;
            rotate90(mat); // if same is false. This will run
        }
        return false;
    }

    static int[][] rotate90(int[][] mat) {
        //Transpose:
        for (int rows = 0; rows < mat.length; rows++) {
            for (int cols = rows; cols < mat.length; cols++) {
                int temp = mat[rows][cols];
                mat[rows][cols] = mat[cols][rows];
                mat[cols][rows] = temp;
            }
        }
        //Reverse the rows
        for (int rows = 0; rows < mat.length; rows++) {
            int start = 0;
            int end = mat.length - 1;
            while (start < end) {
                int temp = mat[rows][start];
                mat[rows][start] = mat[rows][end];
                mat[rows][end] = temp;
                start++;
                end--;
            }
        }
        return mat;
    }
}