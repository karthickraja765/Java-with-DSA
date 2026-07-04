import java.util.Arrays;
import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr [0] = 23;
        arr [1] = 45;
        arr [2] = 77;
        arr [3] = 1;
        arr [4] = 2;
        System.out.println(arr[2]);

        //if we want to take 100 inputs, this above method is tedious.
        //so we can use for loops

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();  // takes input
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // prints the inputs
        }

        for (int j : arr) {            // for every(each) element j in arr, print the element.
            System.out.print(j + " "); // enhanced for loop, here j represents the elements of the array arr
        }

        System.out.println(Arrays.toString(arr)); //it basically converts the given numbers in the for loop to array display kinda output

//      System.out.println(arr[5]); // index out of bound error.

//        // array of objects
//        String[] str = new String[5];
//        for (int i = 0; i < 5; i++) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));
//
//        //modifying
//        str[1] = "Kæ.";
//        System.out.println(Arrays.toString(str));
    }
}
