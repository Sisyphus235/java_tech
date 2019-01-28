package arraysAndStrings;

public class twoSum2 {
    // LeetCode 167, https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public int[] solution(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int current_sum = numbers[start] + numbers[end];
            if (current_sum == target) {
                return new int[] {start + 1, end + 1};
            } else if (current_sum < target) {
                ++start;
            } else {
                --end;
            }
        }
        return new int[] {};
    }
}
