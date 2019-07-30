package array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

/**
 * lc26removeDuplicatesFromSortedArray Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jul 30, 2019</pre>
 */
public class lc26removeDuplicatesFromSortedArrayTest {

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
        lc26removeDuplicatesFromSortedArray remove = new lc26removeDuplicatesFromSortedArray();
        int[] nums1 = {1, 1, 2};
        assert remove.solution(nums1) == 2;
        assertArrayEquals(nums1, new int[]{1, 2, 2});

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assert remove.solution(nums2) == 5;
        assertArrayEquals(nums2, new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4});
    }


} 
