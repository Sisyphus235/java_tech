package array;

import arraysAndStrings.twoSum2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;

/**
 * twoSum2 Tester.
 *
 * @author <Authors name>
 * @since <pre>Jan 28, 2019</pre>
 * @version 1.0
 */
public class lc1TwoSum2Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: solution(int[] numbers, int target)
     *
     */
    @Test
    public void testSolution() throws Exception {
        int[] numbers = new int[]{1, 2, 3, 5, 6};
        int target2 = 4;
        twoSum2 test2 = new twoSum2();
        int[] res2 = test2.solution(numbers, target2);
        System.out.println(Arrays.toString(res2));
        for(int e: res2){ System.out.println(e);}
        assert res2 == new int[]{1, 3};
    }


}
