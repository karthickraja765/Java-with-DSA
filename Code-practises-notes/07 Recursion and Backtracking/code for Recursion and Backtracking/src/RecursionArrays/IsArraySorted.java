package RecursionArrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 9, 12, 13};
        boolean answer = isArraySorted(arr, 0);
        System.out.println(answer);
    }

    static boolean isArraySorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return (arr[index] < arr[index + 1]) && isArraySorted(arr, index + 1);
    }
}