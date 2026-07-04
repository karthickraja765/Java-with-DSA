import java.util.Arrays;

public class columnwithnofixedlength {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,3},
                {23,45,32}
        };

        // printing the output in basic form
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        // printing the output as proper matrix form in enhanced for loop
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
