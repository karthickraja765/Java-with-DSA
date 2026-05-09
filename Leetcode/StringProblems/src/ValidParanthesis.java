import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValidfinal(s));

    }

    // Leetcode: https://leetcode.com/problems/valid-parentheses/description/
    // Also comes under stacks problems

    public static boolean isValid(String s) { // brute force approach
        while (s.contains("()") ||
                s.contains("[]") ||
                s.contains("{}")) {

            s = s.replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        }
        return s.isEmpty();
    }

    public static boolean isValidfinal(String s) { // optimal approach
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false; //Edge case

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
