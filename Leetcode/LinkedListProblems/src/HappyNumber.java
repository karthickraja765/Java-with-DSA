public class HappyNumber {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/happy-number/description/

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = FindSquares(slow); // Move it one step
            fast = FindSquares(FindSquares(fast)); // Move it two steps
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int FindSquares(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans = ans + rem * rem;
            number = number / 10;
        }
        return ans;
    }
}
