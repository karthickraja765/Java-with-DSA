public class MinimumAddToMakeParenthesesValid {

    // Leetcode: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

    public int minAddToMakeValid(String s) {
        int open = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                //We need two '))'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insertions++;
                }
                if (open > 0) {
                    open--;
                } else {
                    insertions++;
                }
            }
        }
        return insertions + (open * 2);
    }
}
