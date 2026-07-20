package RecursionBasics;

public class ProductOfDigits {
    public static void main(String[] args) {
        int POD = productOfDigits(555);
        System.out.println(POD);
    }
    static int productOfDigits(int N) {
        if (N % 10 == N){
            return N;
        }
        return ((N % 10) * productOfDigits(N/10));
    }
}