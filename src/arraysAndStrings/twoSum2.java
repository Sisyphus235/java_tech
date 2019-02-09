package arraysAndStrings;

public class twoSum2 {
    // LeetCode 167, https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public int[] solution(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int currentSum = numbers[start] + numbers[end];
            if (currentSum == target) {
                return new int[]{start + 1, end + 1};
            } else if (currentSum < target) {
                ++start;
            } else {
                --end;
            }
        }
        return new int[]{};
    }
}
