package test.arraysAndStrings; 

import arraysAndStrings.threeSumMulti;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* threeSumMulti Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 23, 2019</pre> 
* @version 1.0 
*/ 
public class threeSumMultiTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: solution(int[] A, int target) 
* 
*/ 
@Test
public void testSolution() throws Exception { 
    int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 5, 5};
    int target = 8;
    threeSumMulti test = new threeSumMulti();
    int response = test.solution(nums, target);
    System.out.println(response);
} 


} 
