package arraysAndStrings;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* longestSubstring Tester. 
* 
* @author <Authors name> 
* @since <pre>Apr 7, 2019</pre> 
* @version 1.0 
*/ 
public class longestSubstringTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: solution(String s) 
* 
*/ 
@Test
public void testSolution() throws Exception { 
    String input = "abcabcbb";
    longestSubstring test = new longestSubstring();
    assert test.solution(input) == 3;
} 


} 
