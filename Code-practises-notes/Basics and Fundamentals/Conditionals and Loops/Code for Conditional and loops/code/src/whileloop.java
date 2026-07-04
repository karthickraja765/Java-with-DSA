import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        /*
        Syntax
        initialisation
        while(boolean condition){
        body
        inc/dec
        }
         */
        Scanner input= new Scanner(System.in);
        int numb = input.nextInt();
        int N= 1;
        while( N <= numb){
            System.out.print(N+ " ");
            N++;
        }
    }
}
