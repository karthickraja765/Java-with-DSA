package BinarySearch;

public class SquareRootOfX {
    public static void main(String[] args) {
        int x = 8;
        int ans = mySqrt(x);
        System.out.println(ans);
    }

    // Leetcode: https://leetcode.com/problems/sqrtx/description/
    static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 2;
        int end = x;

        // condition satisfied when: mid^2 < x
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x) {
                end = mid - 1;
            } else if ((long) mid * mid < x) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return Math.round(end);
    }
}