package arraysAndStrings;

import java.util.HashMap;

public class longestSubstring {
    public int solution(String s) {
        HashMap<Character, Integer> alpha = new HashMap<Character, Integer>();
        int count = 0;
        int first = -1;
        for (int i = 0; i < s.length(); i++) {
            if (alpha.containsKey(s.charAt(i)) && alpha.get(s.charAt(i)) > first) {
                first = alpha.get(s.charAt(i));
            }
            alpha.put(s.charAt(i), i);
            count = Math.max(count, i - first);
        }
        return count;
    }
}
