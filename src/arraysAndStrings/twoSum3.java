package arraysAndStrings;

import java.util.HashMap;

public class twoSum3 {
    // LeetCode 170,
    /*
     * Design and implement a TwoSum class. It should support the following operations:add and find.
     * add - Add the number to an internal data structure.
     * find - Find if there exists any pair of numbers which sum is equal to the value.

     * For example,
     * add(1); add(3); add(5);
     * find(4) -> true
     * find(7) -> false
     */
    private HashMap<Integer, Integer> container = new HashMap<Integer, Integer>();

    public void add(int number) {
        if (!container.containsKey(number)) {
            container.put(number, 1);
        } else {
            container.put(number, container.get(number) + 1);
        }
    }

    public boolean find(int number) {
        for (int i : container.keySet()) {
            int match = number - i;
            if (container.containsKey(match)) {
                if (i == match && container.get(i) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}
