package array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * lc169MajorityElement Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 13, 2019</pre>
 */
public class lc169MajorityElementTest {

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
        lc169MajorityElement solution = new lc169MajorityElement();
        int[] nums = new int[]{3, 2, 3};
        assert solution.solution(nums) == 3;
        int[] nums1 = new int[]{2, 2, 1, 1, 1, 2, 2};
        assert solution.solution(nums1) == 2;
    }

    /**
     * Method: solution1(int[] nums)
     */
    @Test
    public void testSolution1() throws Exception {
        lc169MajorityElement solution1 = new lc169MajorityElement();
        int[] nums = new int[]{3, 2, 3};
        assert solution1.solution1(nums) == 3;
        int[] nums1 = new int[]{2, 2, 1, 1, 1, 2, 2};
        assert solution1.solution1(nums1) == 2;
    }


} 
