package RecursionBasics;

public class WayToZero {
    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int Steps) {
        if (num == 0) {
            return Steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, Steps + 1);
        }
        return helper(num - 1, Steps + 1);
    }
}