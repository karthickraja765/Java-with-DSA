public class BasicConceptRecursion {
    public static void main(String[] args) { // Printing from 1 to 5
        Numbers1(1);
    }

    static void Numbers1(int N) {
        System.out.println(N);
        Numbers2(2);
    }

    static void Numbers2(int N) {
        System.out.println(N);
        Numbers3(3);
    }

    static void Numbers3(int N) {
        System.out.println(N);
        Numbers4(4);
    }

    static void Numbers4(int N) {
        System.out.println(N);
        Numbers5(5);
    }

    static void Numbers5(int N) {
        System.out.println(N);
    }
}
/*
Here we need to learn about the function call.
There are two things to remember:
1. One, Once a function call is ongoing. Until or unless the function call finishes, it remains in stack memory.
2. Two, While the function finishes executing. It is removed from the stack memory and the flow of the program continues from where it is called.

* If you didn't get these points, Debug and check the flow of the program. See it for yourself.
*/