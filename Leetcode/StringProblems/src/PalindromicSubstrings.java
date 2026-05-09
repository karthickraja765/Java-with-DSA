public class PalindromicSubstrings {

    // Leetcode: https://leetcode.com/problems/palindromic-substrings/

    public int countSubstrings(String s) {
        if (s.length() == 1) return 1;
        int count = 0;

        for (int low = 0; low < s.length(); low++) {
            for (int high = low + 1; high <= s.length(); high++) {
                if (isPalindrome(s.substring(low, high))) {
                    count++;
                }
            }
        }
        return count;
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

    public int countSubstringsFinal(String s) { // optimal solution: o(n^2) and space: o(1)
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i); // odd length
            count += expand(s, i, i + 1); // even length
        }
        return count;
    }

    private int expand(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
