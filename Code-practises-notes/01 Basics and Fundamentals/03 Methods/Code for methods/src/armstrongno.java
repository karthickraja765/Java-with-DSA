import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
//        int n = intput.nextInt();
//        boolean ans = isArmstrongno(n);
//        System.out.println(ans);
        for (int i = 100; i < 1000 ; i++) {
            if(isArmstrongno(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrongno(int n){
        int originalno = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        if (sum == originalno){
            return true;
        }
        return false;

    }
}
