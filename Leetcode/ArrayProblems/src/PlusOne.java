import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        int[] ans = plusOne1(digits);
        System.out.println(Arrays.toString(ans));
    }

    // Leetcode: https://leetcode.com/problems/plus-one/
    static int[] plusOne(int[] digits) { //Brute force
        int num = 0;

        for (int i = 0; i < digits.length; i++) { //Converting {1,2,3} -> 123
           num = num * 10 + digits[i];
        }
        num = num + 1; //Adding one to it.

        String str = String.valueOf(num);
        int[] newdigit = new int[str.length()];

        for (int i = 0; i < str.length(); i++) { //Converting 124 -> {1,2,4}
            newdigit[i] = str.charAt(i) - '0'; //Converting char to int (typecasting)
        }
        return newdigit;
    }

    static int[] plusOne1(int[] digits){ //Optimised code
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1; // edge case for digit: 9 = [1, 0]
        return result;
    }
}