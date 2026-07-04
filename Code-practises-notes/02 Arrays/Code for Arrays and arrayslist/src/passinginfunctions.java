import java.util.Arrays;

public class passinginfunctions {
    public static void main(String[] args) {
        int [] arr = {12,45,67,89,98};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0] = 999;
    }
}
