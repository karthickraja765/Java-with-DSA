import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        type 1

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c> max){
//            max = c;
//        }
//        System.out.println("THE MAX VALUE AMONG THESE IS: "+ max);

//        type 2

//        int max = 0;
//        if (a > b){
//            max = a;
//        } else {
//            max = b;
//        }
//        if ( c > max){
//            max = c;
//        }
//        System.out.println("THE LARGEST VALUE IS:" + max);

//        type 3
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
//Uncomment any type and run for reference!!!