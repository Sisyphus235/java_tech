package array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * lc15ThreeSum Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jul 29, 2019</pre>
 */
public class lc15ThreeSumTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: solution(int[] nums)
     */
    @Test
    public void testSolution() throws Exception {
        int[] numbers = new int[]{-1, 0, 1, 2, -1, -4};
        lc15ThreeSum threeSum = new lc15ThreeSum();
        List<List<Integer>> res = threeSum.solution(numbers);
        System.out.println(res);
        // expected [[-1,-1,2],[-1,0,1]]
    }


} 
