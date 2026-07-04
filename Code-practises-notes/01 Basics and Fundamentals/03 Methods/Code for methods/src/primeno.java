import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        int n = intput.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }
    static boolean isPrime(int n){
        if (n < 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        if (c * c > n){
            return true;
        } else {
            return false;
        }
    }
}
