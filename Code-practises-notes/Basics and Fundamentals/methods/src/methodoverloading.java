import java.util.Arrays;

public class methodoverloading {
    public static void main(String[] args) {
//        fun(07);
//        fun("kae");
//        fun(12,23, 34);
        //demo(); will give u an error, because at compile time it cannot be able to decide which one to run.
        demo("kae", "kaae", "kaeeee");
    }

    static void demo(int...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String...v) {
        System.out.println(Arrays.toString(v));
    }


    static int fun(int a , int b) {
        return a+b;
    }

    static void fun(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static String fun(String name) {
        System.out.println(name);
        return name;
    }
}
