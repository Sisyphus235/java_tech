package array;

import array.lc1TwoSum;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * lc1TwoSum Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jul 28, 2019</pre>
 */
public class lc1TwoSumTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: solution(int[] nums, int target)
     */
    @Test
    public void testSolution() throws Exception {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        lc1TwoSum twoSum = new lc1TwoSum();
        int[] res = twoSum.solution(numbers, target);
        assertArrayEquals(res, new int[]{0, 1});
    }


} 
