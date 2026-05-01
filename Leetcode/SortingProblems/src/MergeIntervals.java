import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,3},{2,6},{8,10},{15,18}
        };
        int[][] ans = merge(intervals);
        System.out.println(Arrays.toString(ans));
    }

    // Leetcode: https://leetcode.com/problems/merge-intervals/
    static int[][] mergeBf(int[][] intervals) { //Brute force
        int[][] result = new int[intervals.length][];

        for (int outer = 1; outer < intervals.length - 1; outer++) {
            int firstelement = intervals[outer][0];
            for (int inner = 0; inner < intervals[outer].length; inner++) {
                int colelement = intervals[inner][intervals.length - 1];
                if (colelement > firstelement) {
                    result = mergebothinterval(intervals, colelement, firstelement);
                }
            }
        }
        return result;
    }
    static int[][] mergebothinterval(int[][] intervals, int colele, int firstele) { //This is not finished
        return new int[intervals.length][];
    }

    static int[][] merge(int[][] intervals) { // This code is passed
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> result = new ArrayList<>(); //We don't know the size of the list, so use dynamic list.

        for (int[] interval : intervals) { //If the result is empty or not overlap, don't do anything just add the interval as it is.
            if (result.isEmpty() || result.get(result.size() - 1) [1] < interval[0]){
                    result.add(interval);
            } else { //Merge
                result.get(result.size() - 1) [1] =  Math.max(result.get(result.size() - 1) [1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
