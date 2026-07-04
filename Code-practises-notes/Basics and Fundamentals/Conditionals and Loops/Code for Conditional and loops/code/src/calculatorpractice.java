import java.util.Scanner;

public class calculatorpractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take input from the user until the user presses X or x
        int result = 0;
        while (true){
            System.out.print("ENTER THE OPERATOR");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("ENTER TWO NUMBERS");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+'){
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
                if (op == '/') {
                    if ( num2 != 0 ) {
                        result = num1 / num2;
                    }
                }
                if (op == '%') {
                    result = num1 % num2;
                }
            }
            else {
                System.out.println("INVALID OPERATOR");
                break;
            }
            System.out.println(result);
        }
    }
}

