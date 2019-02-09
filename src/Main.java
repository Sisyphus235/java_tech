import design.Singleton;
import arraysAndStrings.twoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // twoSum
        int[] nums = new int[]{1, 3, 2, 5, 6};
        int target = 4;
        twoSum test = new twoSum();
        int[] res = test.solution(nums, target);
        System.out.println(Arrays.toString(res));
        for (int e : res) {
            System.out.println(e);
        }

        // 单例
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a);
        System.out.println(b);
    }
}
