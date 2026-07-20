package RecursionString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset { // solving Subset problems using iteration method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = SubsetIteration(arr); //Array of Arrays are going to be our answers
        System.out.println("Answer for subset using iteration: " + ans);

        int[] arr1 = {1, 2, 2};
        List<List<Integer>> answer = SubsetIterationDuplicates(arr1);
        System.out.println("Answer for subset using iteration with duplicates:" + answer);
    }

    static List<List<Integer>> SubsetIteration(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>(); // creating an outer list
        outer.add(new ArrayList<>()); // because the empty subset is always included.
        for (int num : arr){  // process each number one by one in arr.
            int n = outer.size(); // get the current size
            /*
            For every existing subset:
	            1.	Copy it
	            2.	Add the current number
	            3.	Add the new subset back
            */
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i)); // creating an inner list and to get the copy of the existing subset we use this outer.get(i)
                internal.add(num);  // add the current number to each subset
                outer.add(internal); // the new subsets are added to the outer list.
            }
        }
        return outer;
    }

    static List<List<Integer>> SubsetIterationDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>(); // creating an outer list
        outer.add(new ArrayList<>()); // because the empty subset is always included.

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {  // if the current and previous element is same.
                start = end + 1; // start adding the number that is end + 1 of the previous subset.
            }
            end = outer.size() - 1; // new length of end is the outer array size
            int n = outer.size(); // get the current size
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j)); // copy of the existing subset we use this outer.get(j)
                internal.add(arr[i]); // add the elements of i with the current number
                outer.add(internal); // add it to the outer list
            }
        }
        return outer;
    }
}