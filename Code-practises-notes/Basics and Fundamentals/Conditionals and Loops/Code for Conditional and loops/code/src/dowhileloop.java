import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();

        /*
        Synatx:

        initialisation;
        do {
        inc/dec;
        } while(condition)

         */

        int N = 1;
        do {
            System.out.print(N + " ");
            N++;
        } while (N <= numb);
    }
}
