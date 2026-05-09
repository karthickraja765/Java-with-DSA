public class LongestPalindromicString {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/longest-palindromic-substring/
    public String longestPalindrome(String s) { // time: still  o(n^3)
        if (s.length() <= 1) return s;

        int maxLen = 0;
        String maxStr = s.substring(0, 1);

        for (int low = 0; low < s.length(); low++) {
            for (int high = low + maxLen; high <= s.length(); high++) {
                if (high - low > maxLen && isPalindrome(s.substring(low, high))) {
                    maxLen = high - low;
                    maxStr = s.substring(low, high);
                }
            }
        }
        return maxStr;
    }

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public String longestPalindromeOptimal(String s) { // This is what chatGPT gave for the optimal solution
        if (s == null || s.length() < 2) return s;

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i); // odd length
            int len2 = expandFromCenter(s, i, i + 1); // even length

            int len = Math.max(len1, len2);

            if (len > end - start + 1) {
                int newStart = i - (len - 1) / 2;
                int newEnd = i + len / 2;
                start = newStart;
                end = newEnd;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }
}
