package dynamicProgramming;

import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 *
 * For example, given the following triangle
 *
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 *
 * Note:
 *
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 */

public class lc120Triangle {
    public int solution(List<List<Integer>> triangle){
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                List<Integer> row = triangle.get(i);
                if (j == 0) {
                    row.set(j, triangle.get(i - 1).get(j) + triangle.get(i).get(j));
                } else if (j == row.size() - 1) {
                    row.set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i).get(j));
                } else {
                    row.set(j, Math.min(triangle.get(i - 1).get(j - 1), triangle.get(i - 1).get(j)) + triangle.get(i).get(j));
                }
                triangle.set(i, row);
            }
        }
        List<Integer> lastRow = triangle.get(triangle.size() - 1);
        int min = lastRow.get(0);
        for (int i = 1; i < lastRow.size(); i++) {
            if (lastRow.get(i) < min) min = lastRow.get(i);
        }
        return min;
    }
    public int solution2(List<List<Integer>> triangle) {
        // 从 triangle 最后一行向前遍历，每一行遍历的时候 dpArray 的当前元素等于当前和下一个位置 dpArray 较小的值 + 三角形当前位置的值
        // dpArray[i] = min(dpArray[i], dpArray[i+1]) + triangle[i][j]
        int [] dpArray = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dpArray[j] = Math.min(dpArray[j], dpArray[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dpArray[0];
    }
}
