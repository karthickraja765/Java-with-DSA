package RecursionBasics;

public class CountZeros {
    public static void main(String[] args) {
        int Z = countZeros(300404500);
        System.out.println(Z);
    }

    // Special pattern case using helper function, How to pass the value to above calls.
    // Debug it and see the flow of the program.
    static int countZeros(int N) {
        return helper(N, 0);
    }

    static int helper(int N, int count) {
        if (N == 0) {
            return count;
        }
        int rem = N % 10;
        if (rem == 0) {
            return helper(N / 10, count + 1);
        }
        return helper(N / 10, count);
    }
}