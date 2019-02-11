package arraysAndStrings;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;
import java.util.List;

/**
 * threeSum Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 9, 2019</pre>
 */
public class threeSumTest {

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
        int[] nums1 = new int[]{-1, 0, 1, 2, -1, -4};
        int[] nums2 = new int[]{0, 0, 0};
        threeSum test = new threeSum();
        List<List<Integer>> response1 = test.solution(nums1);
        for(List l: response1){
            System.out.println(l);
        }
        List<List<Integer>> response2 = test.solution(nums2);
        for(List l: response2){
            System.out.println(l);
        }
    }


} 
