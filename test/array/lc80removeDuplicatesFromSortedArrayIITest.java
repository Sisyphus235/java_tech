package array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

/**
 * lc80removeDuplicatesFromSortedArrayII Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 11, 2019</pre>
 */
public class lc80removeDuplicatesFromSortedArrayIITest {

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
        lc80removeDuplicatesFromSortedArrayII remove = new lc80removeDuplicatesFromSortedArrayII();
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        assert remove.solution(nums1) == 5;
        assertArrayEquals(nums1, new int[]{1, 1, 2, 2, 3, 3});

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        assert remove.solution(nums2) == 7;
        assertArrayEquals(nums2, new int[]{0, 0, 1, 1, 2, 3, 3, 3, 3});
    }


} 
