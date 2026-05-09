public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        System.out.println(multiply(num1, num2));
    }

    // Leetcode: https://leetcode.com/problems/multiply-strings/description/

    public static String multiply(String num1, String num2) { // time cost: o(n^2)
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                // manual school taught multiplication concept.
                // If you don't understand, debug the flow of the program. Don't memorize :/

                int tens = i + j; // carry/tens position
                int ones = i + j + 1; // ones/current position

                int sum = product + result[ones];

                result[ones] = sum % 10;
                result[tens] = result[tens] + sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.isEmpty() && num == 0)) { // Skip zeros only at beginning
                sb.append(num);
            }
        }
        return sb.toString();
    }
}

