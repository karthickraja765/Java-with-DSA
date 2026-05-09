import java.text.DecimalFormat;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    // Leetcode: https://leetcode.com/problems/valid-palindrome/description/
    static public boolean isPalindrome(String s) {
        if (s == null || s.length() == 1) {
            return true;
        }
        String newstr = AlphaNumandWhiteSpaceRemover(s);
        String newstring = newstr.toLowerCase();

        if (isPalindromeStr(newstring)) {
            return true;
        }
        return false;
    }

    static String AlphaNumandWhiteSpaceRemover(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.strip();
        return s;
    }

    static boolean isPalindromeStr(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;

        while (start < end) { //We check the first and last index's element sequentially.
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
