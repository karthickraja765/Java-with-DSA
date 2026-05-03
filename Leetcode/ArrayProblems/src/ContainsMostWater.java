public class ContainsMostWater {
    public static void main(String[] args) {

    }

    // Leetcode: https://leetcode.com/problems/container-with-most-water/
    public int maxAreaBf(int[] height) { // brute force approach
        int maxAmount = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                if (area > maxAmount) {
                    maxAmount = area;
                }
            }
        }
        return maxAmount;
    }


    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;

        while (low < high) {
            int area = Math.min(height[low], height[high]) * (high - low);

            maxArea = Math.max(area, maxArea);

            if(height[low] < height[high]){
                low++;
            } else {
                high++;
            }
        }
        return maxArea;
    }
}
