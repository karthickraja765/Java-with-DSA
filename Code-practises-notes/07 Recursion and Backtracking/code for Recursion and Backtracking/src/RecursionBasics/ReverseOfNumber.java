package RecursionBasics;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int R = Reverse(13965428);
        System.out.println(R);
        int R2 = Reverse2(76543210);
        System.out.println(R2);
    }

    // Method 1:
    static int sum = 0;
    static int Reverse(int N) {
        if (N == 0) {
            return 0;
        }
        int rem = N % 10;
        sum = sum * 10 + rem;
        Reverse(N / 10);
        // return ((N % 10) + (we don't know how to add the number to the correct unit place)+  Reverse(N / 10));
        // Basically, Take a sum variable outside the scope and updating it at last
        return sum;
    }

    // Method 2: Using helper function : (mostly preferred)
    static int Reverse2(int N) {
        int digits = (int) (Math.log10(N)) + 1; // This line calculates the length of the digits.
        return helper(N, digits);
    }

    static int helper(int N, int digits) {
        if (N % 10 == N) { // If the number has only one digit, the return the same digit.
            return N;
        }
        int rem = N % 10;
        // We have to return : Reminder * Place value + Recursive call of helper function.
        return rem * (int) Math.pow(10, digits - 1) + helper(N / 10, digits - 1);
    }
}