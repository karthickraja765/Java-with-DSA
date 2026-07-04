import java.util.Arrays;

public class Reversethearray {
    public static void main(String[] args) {
        int[] arr = {13, 34, 36, 89, 90};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        //o/p; {90,89,36,34,13}
    }
    static int reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1 ;
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return start;
    }
    static void swap(int[] arr,int start,int end){
//        a= 10, b=20
//        temp = a; //temp = 10
//        a = b; //a = 20
//        b = temp; //b = 10
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

