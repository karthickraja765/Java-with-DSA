package RecursionBasics;

public class Sum {
    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println("The sum of the number is: " + sum);

    }
    static int sum(int N) {
        if (N == 1) {
            return 1;
        }
        return N + sum(N - 1);
    }
}