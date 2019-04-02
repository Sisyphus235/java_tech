package linkedList;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* addTwoNumberII Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 31, 2019</pre> 
* @version 1.0 
*/ 
public class addTwoNumberIITest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: solution(listNode l1, listNode l2) 
* 
*/ 
@Test
public void testSolution() throws Exception {
    listNode l1 = new listNode(7);
    l1.next = new listNode(2);
    l1.next.next = new listNode(4);
    l1.next.next.next = new listNode(3);

    listNode l2 = new listNode(5);
    l2.next = new listNode(6);
    l2.next.next = new listNode(4);

    addTwoNumberII test = new addTwoNumberII();
    listNode l = test.solution(l1, l2);
    assert l.val == 7;
    assert l.next.val == 8;
    assert l.next.next.val == 0;
    assert l.next.next.next.val == 7;
} 


} 
