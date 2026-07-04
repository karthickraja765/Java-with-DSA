import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class methodbasic {
    public static void main(String[] args) {
        sum();
        sum();
        sum();
    }
    static void sum(){
        int a,b,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number 1:");
        a = input.nextInt();
        System.out.print("enter the number 2:");
        b = input.nextInt();
        sum = a + b;
        System.out.println("THE SUM IS:" + sum);
    }
}
