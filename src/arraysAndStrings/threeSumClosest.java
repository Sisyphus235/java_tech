package arraysAndStrings;

import java.util.Arrays;

public class threeSumClosest {
    public int solution(int[] nums, int target) {
        Arrays.sort(nums);
        int[] record = new int[]{Integer.MAX_VALUE, 0};
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int currentSum = nums[i] + nums[start] + nums[end];
                int diff = Math.abs(currentSum - target);
                if (diff < record[0]) {
                    record = new int[]{diff, currentSum};
                }
                if (currentSum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return record[1];
    }
}
