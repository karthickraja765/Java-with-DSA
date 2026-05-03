import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange (nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] answer = {-1, -1};

        answer[0] = binarysearch(nums, target, true);

        if (answer[0] != -1) {
            answer[1] = binarysearch(nums, target, false);
        }
        return answer;
    }

    static int binarysearch(int[] nums, int target, boolean Firstoccuranceindex) {
        int start = 0;
        int end = nums.length - 1;
        int answer = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                answer = mid;
                if (Firstoccuranceindex) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
}