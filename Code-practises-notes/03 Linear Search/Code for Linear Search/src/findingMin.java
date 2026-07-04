package src;

public class findingMin {
    public static void main(String[] args) {
        int[] arr = {17, 24, 67, 98, 108, 93, 80, 56};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int minimumval = arr[0]; // Assigning the first element as the minimum value for now.
        for (int num : arr) {
            if (num < minimumval) {
                minimumval = num;
            }
        }
        return minimumval;
    }
}

/*
Syntax:
    for (datatype variable : collection) {
        // use variable
    }
 Both (normal for-loop or enhanced for-each-loop) are almost equally efficient in most cases (O(n))
 But,
	•	Normal for-loop → slightly more control & sometimes faster
	•	Enhanced for-each-loop → cleaner and safer
*/