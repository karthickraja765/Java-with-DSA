import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        matrix format
        1 2 3
        4 5 6
        7 8 9
         */
//        int [] [] twomatrix = new int [3] []; // 3 rows and n columns, row is should be given for sure. column is not mandatory.
//        //or
//        int [][] twoDmatrix = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}  //individual objects can many elements in the arrays of array, thats why column size is not mandatory.
//        };

        //for taking input.
        Scanner in = new Scanner(System.in);
        int [][] mat = new int[3][3];
        System.out.println(mat.length); //prints no of rows

        for (int row = 0; row < mat.length; row++) {  //math.lenght will store the value of number of arrays present in the whole array(which is no of rows).
            for (int col = 0; col < mat[row].length; col++) { // for column we should find the length of each inner arrays. That is arr name of row's length(which is no of columns
                mat[row][col] = in.nextInt();
            }
        }
        //printing output.
        //type 1
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                System.out.print(mat[row][col] +" ");
            }
            System.out.println();
        }
        //type 2 (in a proper matrix format)
        for (int row = 0; row < mat.length; row++) {
            System.out.println(Arrays.toString(mat[row]));
        }

        //type 3 (enhanced for loop)
        for (int[] a : mat){
            System.out.println(Arrays.toString(a));
        }
    }
}
