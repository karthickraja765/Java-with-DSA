import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        for (int number=1; number <= 5; number+=2){
            System.out.println(number);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int numb = input.nextInt();
        for ( int N = 1; N <=numb; N++) {
            System.out.print(N + " ");
        }
    }
}

