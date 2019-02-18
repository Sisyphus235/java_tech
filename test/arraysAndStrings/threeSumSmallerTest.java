package arraysAndStrings;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * threeSumSmaller Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 17, 2019</pre>
 */
public class threeSumSmallerTest {

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
        int[] nums = new int[]{-2, 0, 1, 3};
        int target = 2;
        threeSumSmaller test = new threeSumSmaller();
        int response = test.solution(nums, target);
        System.out.println(response);
    }


} 
