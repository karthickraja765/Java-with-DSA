package src;

// Unlike Binary search, this need not be sorted! It works in unsorted too.
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 62, 90, 13, 56, 34, 7};
        int target = 56;
        int result = linearSearch(arr, target);
        int result1 = linearSearchFindElement(arr, 34);
        boolean result2 = linearSearchBooleanAns(arr, 7);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

    // Type 1: if target found return the index of the element.
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) { // check every element in every index, if it is equals the target.
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // returns -1 if the element is not found after the search is done.
    }

    //Type 2: for returning the element itself.
    static int linearSearchFindElement(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("No elements found");
        }
        for (int element : arr) { // check every element in every index in arr, if it is equals the target.
            if (target == element) {
                return element;
            }
        }
        System.out.println("Element not found!");  // returns 0 after the search is done.
        return 0;
    }

    // Type 3: if target found returns true, else false.
    static boolean linearSearchBooleanAns(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("No elements");
            return false;
        }
        for (int element : arr) { // check every element in every index, if it is equals the target.
            if (target == element) {
                return true;
            }
        }
        System.out.println("Element not found!");  // returns false if element not found after the search is done.
        return false;
    }
}