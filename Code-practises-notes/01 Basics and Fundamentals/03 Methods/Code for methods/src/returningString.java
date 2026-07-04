import java.util.Scanner;

public class returningString {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        Scanner input = new Scanner(System.in);
        String greeting = input.next();
        return greeting;
    }
}
