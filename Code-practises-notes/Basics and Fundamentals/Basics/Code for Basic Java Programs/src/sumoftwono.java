import java.util.Scanner;

public class sumoftwono {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("PLEASE INPUT YOUR FIRST NO:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println("SUM:" + sum);
    }
}
