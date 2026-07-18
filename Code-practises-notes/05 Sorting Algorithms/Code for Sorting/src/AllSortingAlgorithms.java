import java.util.Arrays;

//This is a practise code!

public class AllSortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        bubble(arr);
        System.out.println(Arrays.toString(arr));

        selection(arr);
        System.out.println(Arrays.toString(arr));

        insertion(arr);
        System.out.println(Arrays.toString(arr));

        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int minindex = min(arr, 0, last);
            swap(arr, minindex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int min(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length-1) {
            int correctindex = arr[i] - 1;
            if (arr[i] != arr[correctindex]) {
                swap(arr, i, correctindex);
            } else {
                i++;
            }
        }
    }
}