import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int ans = 0;
        while ( n > 0 ) {
            int remind = n % 10;
            n /= 10;

            ans = ans * 10 + remind;
        }
        System.out.println(ans);
    }
}
