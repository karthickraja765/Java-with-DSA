import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram(String s, String t) { // Time complexity: O(n log n)

        if (s.length() != t.length()) { // checking length.
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr); // time cost for sorting both arrays: O(n log n)
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr); // time for comparing: o(n)
    }

    public boolean isAnagramFinal(String s, String t) { // time complexity: o(n)
        int length_s = s.length();
        int length_t = t.length();

        if (length_s != length_t) { // checking the length
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int j : freq) {
            if (freq[j] != 0) {
                return false;
            }
        }
        return true;
    }
}
