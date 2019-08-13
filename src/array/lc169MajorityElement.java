package array;

import java.util.HashMap;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

public class lc169MajorityElement {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> total = new HashMap<Integer, Integer>();
        int bar = nums.length / 2;
        for (int item : nums) {
            int count = total.containsKey(item) ? total.get(item) : 0;
            if (count + 1 > bar) return item;
            total.put(item, ++count);
        }
        return 0;
    }

    public int solution1(int[] nums) {
        // the task is to find the element that appears more than n/2 times, so we can compare the answer with every elements
        if (nums == null || nums.length == 0) return 0;
        int maxVote = 0;
        int num = 0;
        for (int item : nums) {
            if (maxVote == 0) num = item;
            if (num == item) maxVote++;
            else maxVote--;
        }
        return maxVote >= 1 ? num : -1;
    }
}
