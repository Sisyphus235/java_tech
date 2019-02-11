package arraysAndStrings;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * threeSumClosest Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 11, 2019</pre>
 */
public class threeSumClosestTest {

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
        int[] nums = new int[]{-1, 2, 1, -4};
        threeSumClosest test = new threeSumClosest();
        int response = test.solution(nums, 1);
        System.out.println(response);

        int[] nums2 = new int[]{-1, 0, 1, 1, 55};
        threeSumClosest test2 = new threeSumClosest();
        int response2 = test2.solution(nums2, 3);
        System.out.println(response2);
    }


} 
