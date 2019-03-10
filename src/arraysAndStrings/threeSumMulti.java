package arraysAndStrings;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.HashMap;
import java.util.List;

import static java.lang.Math.pow;

public class threeSumMulti {
    public int solution(int[] A, int target) {
        int bound = (int) (pow(10, 9) + 7);
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (count.containsKey(A[i])) {
                count.put(A[i], count.get(A[i]) + 1);
            } else {
                count.put(A[i], 1);
            }
        }
        int res = 0;
        return 0;
    }

}
