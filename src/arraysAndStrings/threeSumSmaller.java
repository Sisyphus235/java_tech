package arraysAndStrings;

import java.util.Arrays;

public class threeSumSmaller {
    public int solution(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] >= target) {
                break;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum >= target) {
                    right -= 1;
                } else {
                    count += right - left;
                    break;
                }
            }
        }
        return count;
    }
}
