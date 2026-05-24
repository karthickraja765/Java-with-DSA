public class MinimumInsertionsToBalanceAParathesisString {

    // Leetcode: https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/
    // Same code as the Minimum Add to make parenthesis valid

    public int minInsertions(String s) {
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
