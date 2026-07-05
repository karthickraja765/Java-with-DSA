public class infiniteArrayBS {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 7 ,9, 10, 13, 15, 67, 78, 89, 90, 102, 170, 238, 345, 456, 567, 789, 890, 900};
        int target = 345;
        int result = ans(arr, target);
        System.out.println(result);
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) { // Keep increasing the range until the target is within it, condition for the target to lie within the range
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; // this line the search double the window size every time

            if (end >= arr.length) {
                end = arr.length - 1;
            }
            start = newStart; // updating the old start to new start
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}