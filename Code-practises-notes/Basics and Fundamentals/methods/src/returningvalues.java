import java.util.Scanner;

public class returningvalues {
    public static void main(String[] args) {
        int answer = sum();
        System.out.println(answer);
    }
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number 1:");
        int a = input.nextInt();
        System.out.print("enter the number 2:");
        int b = input.nextInt();
        int sum = a + b;
        return sum;
//        System.out.println("after the return of something after the statement nothing will execute");
    }
}
