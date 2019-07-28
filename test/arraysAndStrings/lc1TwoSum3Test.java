package arraysAndStrings;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * twoSum3 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 1, 2019</pre>
 */
public class twoSum3Test {

    @Before
    public void before() throws Exception {
        int i = 1, a = 0;
        a = i++;
        System.out.println(a);
        assert a == 1;

        int j = 1, b = 0;
        b = ++j;
        System.out.println(b);
        assert b == 2;
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: add(int number)
     */
    @Test
    public void testAdd() throws Exception {
        twoSum3 map = new twoSum3();
        map.add(3);
        map.add(3);
        assert map.find(6);
        assert !map.find(3);
    }

    /**
     * Method: find(int number)
     */
    @Test
    public void testFind() throws Exception {
//TODO: Test goes here... 
    }


} 
