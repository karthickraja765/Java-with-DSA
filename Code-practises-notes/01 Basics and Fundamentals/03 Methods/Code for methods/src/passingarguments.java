import java.util.Scanner;

public class passingarguments {
    public static void main(String[] args) {
//        type 1
//        int sum = sum (10, 20);
//        System.out.println(sum);
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String message = mygreet(name);
        System.out.println(message);
    }

    static String mygreet(String name) {
        String msg = "hello" +" "+ name;
        return msg;
    }

//    static int sum( int a, int b){
//        int sum = a + b;
//        return sum;
    }
