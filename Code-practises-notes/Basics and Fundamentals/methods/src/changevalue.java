import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        int[] arr = {1,23,34,222,55,2};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // if u make a change to the object via this reff variable the changes in the original variable changes (or) the same variable is changed.
    }
}
