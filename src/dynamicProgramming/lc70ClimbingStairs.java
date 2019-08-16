package dynamicProgramming;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */

public class lc70ClimbingStairs {
    public int solution(int n) {
        // dpArray[n] = dpArray[n-1] + dpArray[n-2]
        if (n < 2) return 1;
        int[] dpArray = new int[n + 1];
        dpArray[0] = 1;
        dpArray[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dpArray[i] = dpArray[i - 1] + dpArray[i - 2];
        }
        return dpArray[n];
    }

    public int solution2(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int prev = 1;
        int cur = 2;
        int count = 2;
        while (count < n) {
            int temp = prev + cur;
            prev = cur;
            cur = temp;
            count++;
        }
        return cur;
    }
}
