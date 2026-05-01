package BinarySearch;

public class SquareRootOfX {
    public static void main(String[] args) {
        int x = 4;
        int ans = mySqrt(x);
        System.out.println(ans);
    }

    static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x) {
                end = mid - 1;
            } else if (mid < x) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return Math.round(end);
    }
}