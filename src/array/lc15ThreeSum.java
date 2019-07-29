package array;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */

public class lc15ThreeSum {
    public List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int value = nums[i] + nums[low] + nums[high];
                if (value == 0) {
                    List<Integer> toAdd = Arrays.asList(nums[i], nums[low], nums[high]);
                    if (!res.contains(toAdd)) {
                        res.add(toAdd);
                    }
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high++;
                    low++;
                    high--;
                } else if (value < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return res;
    }
}
