import java.util.Arrays;
import java.util.Scanner;


// Hackerank: https://www.hackerrank.com/challenges/game-of-two-stacks/problem

public class GameOf2Stacks {
    static int TwoStacks(int Max, int[] s1, int[] s2) {
        return TwoStacks(Max, s1, s2, 0, 0) - 1;
    }

    private static int TwoStacks(int Max, int[] s1, int[] s2, int sumSoFar, int count) {
        if (sumSoFar > Max) { // Base condition
            return count;
        }
        if (s1.length == 0 || s2.length == 0) return count;
        int a = TwoStacks(Max, Arrays.copyOfRange(s1, 1, s1.length), s2, sumSoFar + s1[0], count + 1);
        int b = TwoStacks(Max, s1, Arrays.copyOfRange(s2, 1, s2.length), sumSoFar + s2[0], count + 1);

        return Math.max(a,b);
    }

    // This is the optimal solution. Just the recursive part.
    static int TwoStacks2(int max, int[] s1, int[] s2) {
        return helper(max, s1, s2, 0, 0, 0);
    }

    static int helper(int max, int[] s1, int[] s2, int i, int j, int sum) {
        if (sum > max) return -1;

        int count = i + j;

        int a = helper(max, s1, s2, i + 1, j, sum + (i < s1.length ? s1[i] : 0));
        int b = helper(max, s1, s2, i, j + 1, sum + (j < s2.length ? s2[j] : 0));

        return Math.max(count, Math.max(a, b));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        for (int i = 0; i < testcases; i++) {
            int array1Size = s.nextInt();
            int array2Size = s.nextInt();
            int sum = s.nextInt();
            int[] a = new int[array1Size];
            int[] b = new int[array2Size];
            for (int j = 0; j < array1Size; j++) { //Array 1
                a[j] = s.nextInt();
            }
            for (int k = 0; k < array2Size; k++) { // Array 2
                b[k] = s.nextInt();
            }
            System.out.println(TwoStacks(sum, a, b));
        }
    }
}