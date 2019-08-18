package dynamicProgramming;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;
import java.util.List;

/**
 * lc120Triangle Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 18, 2019</pre>
 */
public class lc120TriangleTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: solution(List<List<Integer>> triangle)
     */
    @Test
    public void testSolution() throws Exception {
        List<Integer> row1 = Arrays.asList(2);
        List<Integer> row2 = Arrays.asList(3, 4);
        List<Integer> row3 = Arrays.asList(6, 5, 7);
        List<Integer> row4 = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> triangleList = Arrays.asList(row1, row2, row3, row4);

        lc120Triangle triangle = new lc120Triangle();
        assert triangle.solution(triangleList) == 11;
    }

    /**
     * Method: solution2(List<List<Integer>> triangle)
     */
    @Test
    public void testSolution2() throws Exception {
        List<Integer> row1 = Arrays.asList(2);
        List<Integer> row2 = Arrays.asList(3, 4);
        List<Integer> row3 = Arrays.asList(6, 5, 7);
        List<Integer> row4 = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> triangleList = Arrays.asList(row1, row2, row3, row4);

        lc120Triangle triangle = new lc120Triangle();
        assert triangle.solution2(triangleList) == 11;
    }


} 
