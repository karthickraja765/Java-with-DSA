package src;

public class SearchingWithinRange {
    public static void main(String[] args) {
        int [] arr = {17, 24, 67, 98, 108, 93, 80, 56};
        int target = 98;
//        you can also initialise start-and-end separately like this or
//        int start = 2;
//        int end = 6;
        System.out.println(searchingInRange(arr, target, 2, 5));
    }

    static int searchingInRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end ; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}