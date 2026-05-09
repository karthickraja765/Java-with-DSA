public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    // Leetcode: https://leetcode.com/problems/longest-common-prefix/description/
    static public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i > strs[j].length() || strs[j].charAt(i) != ch) { // Does this string even have a character at index i? or if the current character is not matching the ch
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
