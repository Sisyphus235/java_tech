package arraysAndStrings;

import java.util.HashMap;
import java.util.ArrayList;

public class longestSubstringTwoCharacter {
    public int solution(String s) {
        HashMap<Character, Integer> record = new HashMap<Character, Integer>();
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (record.containsKey(s.charAt(i))) {
                record.put(s.charAt(i), record.get(s.charAt(i)) + 1);
            } else {
                if (record.size() < 2) {
                    record.put(s.charAt(i), 1);
                } else {
                    int current_count = 0;
                    ArrayList<Integer> values = new ArrayList<Integer>(record.values());
                    for (int j = 0; j < values.size(); j++) {
                        current_count += values.get(j);
                    }
                    if (current_count > count) {
                        count = current_count;
                    }
                    while (record.size() > 1) {
                        int value = record.get(s.charAt(start));
                        value -= 1;
                        if (value == 0){
                            record.remove(s.charAt(start));
                        } else {
                            record.put(s.charAt(start), value);
                        }
                        start += 1;
                    }
                    record.put(s.charAt(i), 1);
                }
            }
        }
        return count;
    }
}
