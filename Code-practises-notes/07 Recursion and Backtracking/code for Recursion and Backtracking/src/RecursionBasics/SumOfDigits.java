package RecursionBasics;

public class SumOfDigits {
    public static void main(String[] args) {
        int SOD = sumOfDigits(12345);
        System.out.println(SOD);
    }
    static int sumOfDigits(int N) {
        if (N == 0) {
            return 0;
        }
        return ((N % 10) + sumOfDigits(N / 10));
    }
}