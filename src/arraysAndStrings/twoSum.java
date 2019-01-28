package arraysAndStrings;

import java.util.HashMap;

public class twoSum {
    //    LeetCode 1, https://leetcode.com/problems/two-sum/
    public int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (sumMap.containsKey(target - nums[i])) {
                return new int[]{i, sumMap.get(target - nums[i])};
            }
            sumMap.put(nums[i], i);
        }
        return new int[]{};

    }

}
