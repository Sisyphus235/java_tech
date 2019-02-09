package arraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class threeSum {
    public List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> response = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int target = 0 - nums[i];
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    if (nums[start] > Math.floor(target / 2) || nums[end] < Math.floor(target / 2)) {
                        break;
                    }
                    int currentSum = nums[start] + nums[end];
                    if (currentSum == target) {
                        response.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while (start < end && nums[start + 1] == nums[start]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        start++;
                        end--;
                    } else if (currentSum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return response;
    }
}
