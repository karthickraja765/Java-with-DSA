public class countRotationInAnArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2,3};
        System.out.println(CountRotations(arr));
    }

    static int CountRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //there are 4 cases to find the pivot element
            //case1:
            //what if the middle element is in the last position? mid+1 has no element. Hence, it will give Java index-out-of-bounds error.
            //so add this to the if statement.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //case2:
            //what if the middle element is in the first position? mid-1 has no element. Hence, it will give Java index-out-of-bounds error.
            //so add this to the if statement.
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //case3 & 4;
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}