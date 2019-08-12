package array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;

/**
 * lc167TwoSumII Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 12, 2019</pre>
 */
public class lc167TwoSumIITest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: solution(int[] numbers, int target)
     */
    @Test
    public void testSolution() throws Exception {
        lc167TwoSumII sumII = new lc167TwoSumII();
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(sumII.solution(numbers, target), new int[]{1, 2});
    }


} 
