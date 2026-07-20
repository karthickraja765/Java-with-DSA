package RecursionBasics;

public class BasicRecursionProblems {
    public static void main(String[] args) {
        System.out.println("Printing Numbers from N to 1: ");
        Printing_N_to_1(7);
        System.out.println();
        System.out.println("Printing Numbers from 1 to N: ");
        Printing_1_to_N(7);
        System.out.println();
        System.out.println("Printing Numbers from Both ways: ");
        Printing_Both(7);
        System.out.println("Concept of passing");
        Concept_of_passing(5);

        // Tip: If you don't understand this code function, Debug and see it
    }

    static void Concept_of_passing(int Z) {
        if (Z == 0) {
            return;
        }
        System.out.println(Z);
        Concept_of_passing(--Z);
        /*
        * Z-- Vs --Z are both different.
        * Z-- will first pass 5 and subtract & again pass 5 and subtract & it keeps on doing the same thing.
        * --Z will first subtract and pass it.
        */
    }

    static void Printing_N_to_1(int N) {
        if (N == 0) {
            return;
        }
        System.out.println(N);
        Printing_N_to_1(N - 1);
    }

    static void Printing_1_to_N(int X) {
        if (X == 0) {
            return;
        }
        Printing_1_to_N(X - 1);
        System.out.println(X);
    }

    static void Printing_Both(int Y) {
        if (Y == 0) {
            return;
        }
        // Before the recursive call it will print in N to 1 order
        System.out.println(Y);
        Printing_Both(Y - 1); // Recursion call
        // After the recursive call it will print in 1 to N order
        System.out.println(Y);
    }
}
