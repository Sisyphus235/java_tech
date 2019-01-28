import design.Singleton;
import arraysAndStrings.twoSum;
import arraysAndStrings.twoSum2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // twoSum2
        int[] numbers = new int[]{1, 2, 3, 5, 6};
        int target2 = 4;
        twoSum2 test2 = new twoSum2();
        int[] res2 = test2.solution(numbers, target2);
        System.out.println(Arrays.toString(res2));
        for(int e: res2){ System.out.println(e);}

        // twoSum
        int[] nums = new int[]{1, 3, 2, 5, 6};
        int target = 4;
        twoSum test = new twoSum();
        int[] res = test.solution(nums, target);
        System.out.println(Arrays.toString(res));
        for(int e: res){ System.out.println(e);}

        // 单例
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a);
        System.out.println(b);
    }
}
