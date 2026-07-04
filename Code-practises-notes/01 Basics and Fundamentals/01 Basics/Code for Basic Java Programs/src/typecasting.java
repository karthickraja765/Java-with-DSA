import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Byte b= 50;
        char c= 'a';
        short s= 1500;
        float f= 57.23f;
        double d= 238497.1231;
        long l= 23469121;
        int i= 50000;
        double result= (b+f)+(i/s)*(c+d);
        System.out.println((b+f)+" "+(i/s)+" "+(c*d));
        System.out.println(result);



    }
}
