package OOP2.StaticExample;

public class StaticBlock {
    static int a = 5;
    static int b;

    static { //This static block will only run once, when the first object is created. i.e when the class is loaded for the first time.
        b = a * 5;
        System.out.println("This is static block and it prints " + b);
    }

    static void method(int x) {
        System.out.println("X = " + x);
        System.out.println("Y = " + a);
        System.out.println("Z = " + b);
    }

    public static void main(String[] args) {
        method(99);

        System.out.println("------------------------------------------------------------------");

        System.out.println(StaticBlock.a + " and " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " and " + StaticBlock.b );

        System.out.println("------------------------------------------------------------------");
    }
}