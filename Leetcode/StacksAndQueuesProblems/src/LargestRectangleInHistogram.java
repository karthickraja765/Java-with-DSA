import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/largest-rectangle-in-histogram/description/
    // Asked in Google, Amazon

    public static int largestRectangleArea(int[] heights) { // Time: O(n), space: O(1)
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        stack.push(0); // Push first index.
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) { // current height is smaller than the height of the top of the stack?
                maxArea = getMax(heights, stack, maxArea, i);
            }
            stack.push(i); // If while condition is false, then push the next index
        }
        int i = heights.length;
        while (!stack.isEmpty()) {
            maxArea = getMax(heights, stack, maxArea, i);
        }
        return maxArea;
    }

    public static int getMax(int[] arr, Stack<Integer> stack, int maxA, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()) { // if there is only one index.
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(maxA, area);
    }


    public static int largestRectangleArea1(int[] heights) { // optimal solution
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];

                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
