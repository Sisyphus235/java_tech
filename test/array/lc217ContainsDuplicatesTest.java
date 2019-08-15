package array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * lc217ContainsDuplicates Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 15, 2019</pre>
 */
public class lc217ContainsDuplicatesTest {

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
        lc217ContainsDuplicates duplicates = new lc217ContainsDuplicates();
        int[] nums = new int[]{1, 2, 3, 1};
        assert duplicates.solution(nums);

        int[] nums1 = new int[]{1, 2, 3, 4};
        assert !duplicates.solution(nums1);

        int[] nums2 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assert duplicates.solution(nums2);
    }


} 
