package code401Challenges.stackandqueues.pseudoQueue;

import code401Challenges.stackandqueues.Stack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPseudoQueue {
//    @Before
//    public void TestPseudoQueueSetup(){
//        PseudoQueue queue = new PseudoQueue();
//        System.out.println("Setup complete.");
//    }

    public void enqueueNodes(PseudoQueue q, int n){
        for(int i = 1; i <= n; i++){
            q.enqueue(i);
        }
    }

//    public void dequeueNodes(PseudoQueue q, int n){
//        for(int i = 0; i < n; i++){
//            q.dequeue();
//        }
//    }

    @Test
    public void testConstructor() {
        PseudoQueue queue = new PseudoQueue();
        assertTrue(queue.isStackEmpty(queue.getStack1()));
        assertTrue(queue.isStackEmpty(queue.getStack2()));
    }

    @Test(expected = IllegalStateException.class)
    public void testPeek_exception() {
        PseudoQueue queue = new PseudoQueue();
        assertNull(queue.getStack2().peek());
    }
    @Test
    public void testEnqueue() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(1);

        assertNotNull("Stack2 top should not be null after initial push.", queue.getStack2().getTop());
        assertNull("Stack1 should be null after the enqueue operation is finished.", queue.getStack1().getTop());
        assertEquals("Stack2.top actual value should be equal to the expected value.", 1, queue.getStack2().peek());

    }

    @Test
    public void testEnqueue_multipleValues(){
        PseudoQueue queue = new PseudoQueue();
        enqueueNodes(queue, 5);

        assertEquals("Stack2 top should be equal to the expected value.", 1, queue.getStack2().peek());
    }
}
