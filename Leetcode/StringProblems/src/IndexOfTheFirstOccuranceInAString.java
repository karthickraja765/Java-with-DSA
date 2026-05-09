public class IndexOfTheFirstOccuranceInAString {
    public static void main(String[] args) {
        String haystack = "sabutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    // Leetcode: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}
