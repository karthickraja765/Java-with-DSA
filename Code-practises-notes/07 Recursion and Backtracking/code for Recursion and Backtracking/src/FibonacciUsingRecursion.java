public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int ans = Fibonacci(4);
        System.out.println(ans);
    }
    static int Fibonacci(int N) {
        if (N < 2) {
            return N;
        }
        return Fibonacci(N-1) + Fibonacci(N-2); // This is a Recursive formula or operation.
    }
}