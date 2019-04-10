package arraysAndStrings;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* longestSubstringTwoCharacter Tester. 
* 
* @author <Authors name> 
* @since <pre>Apr 10, 2019</pre> 
* @version 1.0 
*/ 
public class longestSubstringTwoCharacterTest { 

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
    String input = "ecebbed";
    longestSubstringTwoCharacter test = new longestSubstringTwoCharacter();
    assert test.solution(input) == 4;
} 


} 
