public class FibonacciUsingFormula {
    public static void main(String[] args) {
        System.out.println("Fibonacci number from 1 to 10:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(FibonacciFormula(100));
    }

    static long FibonacciFormula(int N) {
        // Type casting using long Datatype because answer will exceed the int range.
        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), N ) - Math.pow(((1 - Math.sqrt(5)) / 2), N)) / Math.sqrt(5));
    }
}

/*
* Why using formula? Thing is, the usual method of Finding the Nth fibonacci number is not efficient enough to find for larger numbers (More than 20).
* That is why we use formula method to compute it more efficiently.
* Formula(N) = (((1 + Root 5) / 2)^ N) - (((1 - Root 5) / 2)^ N) / Root 5
*/
