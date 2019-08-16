package dynamicProgramming;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * lc70ClimbingStairs Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 16, 2019</pre>
 */
public class lc70ClimbingStairsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: solution(int n)
     */
    @Test
    public void testSolution() throws Exception {
        lc70ClimbingStairs climb = new lc70ClimbingStairs();
        assert climb.solution(2) == 2;
        assert climb.solution(3) == 3;
        assert climb.solution(4) == 5;
    }

    /**
     * Method: solution2(int n)
     */
    @Test
    public void testSolution2() throws Exception {
        lc70ClimbingStairs climb = new lc70ClimbingStairs();
        assert climb.solution2(2) == 2;
        assert climb.solution2(3) == 3;
        assert climb.solution2(4) == 5;
    }


} 
