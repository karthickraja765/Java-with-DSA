package RecursionArrays;

import java.util.ArrayList;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 11, 13, 15, 9, 13};
        int target = 13;

        System.out.print("Linear Search: ");
        System.out.println(LinearSearch(arr, target, 0));

        System.out.print("Linear Searched Index: ");
        System.out.println(LinearSearchIndex(arr, target, 0));

        System.out.print("Linear Searched Multiple indices: ");
        LinearSearchMultipleIndex(arr, target, 0);
        System.out.println(list);

        System.out.print("Linear Searched Multiple indices Put in a ArrayList: ");
        LinearSearchMultipleIndex2(arr, target, 0, new ArrayList<>());
        System.out.println(list);

        // This above one is same as the Above!
        ArrayList<Integer> lst = new ArrayList<>();
        LinearSearchMultipleIndex2(arr, target, 0, list);
        System.out.println(lst);

        System.out.print("Linear Searched Multiple indices without arguments Put in a ArrayList: ");
        ArrayList<Integer> ans = LinearSearchMultipleIndexwithoutpassingArgu(arr, target, 0);
        System.out.println(ans);
    }

    static boolean LinearSearch(int[] arr, int target, int index) {
        if (index > arr.length) {
            return false;
        }
        return (arr[index] == target) || LinearSearch(arr, target, index + 1);
    }

    // You can also search from the last to first; by changing the index value from 0 to arr.length - 1; and index - 1 at the recursion call.
    static int LinearSearchIndex(int[] arr, int target, int index) {
        if (index > arr.length) {
            return -1;
        }
        if ((arr[index] == target)) {
            return index;
        } else {
            return LinearSearchIndex(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>(); // We have to create an ArrayList and store the indices of the targets
    static void LinearSearchMultipleIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if ((arr[index] == target)) {
            list.add(index); // This line updates the arraylist
        }
        LinearSearchMultipleIndex(arr, target, index + 1);
    }

    // We can also do by creating a ArrayList in the main function and passing it here in the arguments.
    static ArrayList<Integer> LinearSearchMultipleIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if ((arr[index] == target)) {
            list.add(index);
        }
        return LinearSearchMultipleIndex2(arr, target, index + 1, list);
    }

    // This case is special, Try drawing recursive tree and find out
    static ArrayList<Integer> LinearSearchMultipleIndexwithoutpassingArgu(int[] arr, int target, int index) {
        ArrayList<Integer> Arr = new ArrayList<>(); // Creating a new ArrayList inside the body
        if (index == arr.length) {
            return Arr;
        }
        // This will contain only the answers of that function call only.
        if ((arr[index] == target)) {
            Arr.add(index);
        }
        ArrayList<Integer> AnswersfromBelowCalls = LinearSearchMultipleIndexwithoutpassingArgu(arr, target, index + 1);
        // Adding all the answers from the previous calls
        Arr.addAll(AnswersfromBelowCalls);
        // Return the List
        return Arr; //returns the index.
    }
}
