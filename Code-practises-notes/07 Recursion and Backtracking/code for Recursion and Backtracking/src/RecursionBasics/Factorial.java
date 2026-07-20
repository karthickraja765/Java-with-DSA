package RecursionBasics;

public class Factorial {
    public static void main(String[] args) {
        int Fact = factorial(4);
        System.out.println("Factorial of the number is: " + Fact);
    }

    static int factorial(int N) {
        if (N == 1){
            return 1;
        }
        return N * factorial(N - 1);
    }
}