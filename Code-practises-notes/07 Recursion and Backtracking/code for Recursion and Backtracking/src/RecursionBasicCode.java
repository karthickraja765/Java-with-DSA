public class RecursionBasicCode {
    public static void main(String[] args) {
        PrintingNumbers(1);
    }

    static void PrintingNumbers(int N) {
        if (N == 5) { // Base Condition
            System.out.println(5);
            return;
        }
        System.out.println(N);
        PrintingNumbers(N + 1); // Recursive call
    }
}

/*
* Base condition: If this condition is not given, then the program keeps on repeat the recursion call Endlessly
* Recursive Call: If you're calling a function again and again, you can treat it as a separate function memory in the stack
* The last function call is called as tail recursion.
* Tail recursion in Java is a form of recursion where the recursive call is the last operation executed in the function.
* That means once the recursive call is made, there is no additional work left to do in the current function frame.
* Note: If you didn't know How this thing is working internally, Debug and check the flow of the program.
*/