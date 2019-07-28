package array;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * https://leetcode.com/problems/two-sum/
 */

public class lc1TwoSum {
    public int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int toSearch = target - nums[i];
            if (sumMap.containsKey(toSearch)) {
                return new int[]{sumMap.get(toSearch), i};
            }
            sumMap.put(nums[i], i);
        }
        return new int[]{};
    }

}
