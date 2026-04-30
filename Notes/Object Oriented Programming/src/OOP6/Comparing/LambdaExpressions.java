package OOP6.Comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        list.forEach((item) -> System.out.print(item * 2 + " "));  // This is a Lambda expression

        System.out.println();
        System.out.println("------------------------------------------------------------------");

        Consumer<Integer> world = (item) -> System.out.print(item * 3 + " ");
        list.forEach(world);

        System.out.println();
        System.out.println("------------------------------------------------------------------");

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaExpressions  mycalculator = new LambdaExpressions();
        System.out.println(mycalculator.Calculate(5, 2, mul));

        System.out.println("------------------------------------------------------------------");
    }

    private int Calculate(int a, int b, Operation op) {
        return op.operations(a, b);
    }
}

interface Operation {
    int operations(int a, int b);
}