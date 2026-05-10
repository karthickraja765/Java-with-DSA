package BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] mountainArr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(findInMountainArray(mountainArr, target));

    }

    static int findInMountainArray(int[] mountainArr, int target) {
        int peak = peakelement(mountainArr);

        int firstry =  orderAgnoBS(mountainArr, target,0, peak);
        if (firstry != -1) {
            return firstry;
        }
        return orderAgnoBS(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    static int peakelement(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] > mountainArr[mid + 1]) { // 3,4,5,3,1
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnoBS(int[] mountainArr, int target, int start, int end) {
        boolean isAsc = (mountainArr[start] < mountainArr[end]);

        while (start <= end) {
            int mid = start + (end - start);

            if (mountainArr[mid] == target) { //Common condition
                return mid;
            }
            if (isAsc) {
                if (target < mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < mountainArr[mid]) {
                    start = mid + 1;
                } else {
                    end =  mid - 1;
                }
            }
        }
        return -1;
    }
}