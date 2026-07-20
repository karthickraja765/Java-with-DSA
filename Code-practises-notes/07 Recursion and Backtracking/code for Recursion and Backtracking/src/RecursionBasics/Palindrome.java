package RecursionBasics;

public class Palindrome { // Reverse of the number is equal to the original number.
    public static void main(String[] args) {
        System.out.println(palindrome(1234321));
    }

    static int reverse(int N) {
        int digit = (int) (Math.log10(N)) + 1; // This line calculates the length of the digits.
        return helper(N, digit);
    }

    static int helper(int N , int digit) {
        if (N % 10 == N) { // If the number has only one digit, the return the same digit.
            return N;
        }
        int rem = N % 10;
        // We have to return rem + place value + helper function;
        return rem * (int) Math.pow(10, digit - 1) + helper(N / 10, digit - 1);
    }

    static Boolean palindrome(int N) {
        return (reverse(N) == N);
    }
}