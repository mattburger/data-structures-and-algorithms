package code401Challenges.stackandqueues.pseudoQueue;

import code401Challenges.stackandqueues.Stack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPseudoQueue {
    @Before
    public void TestPseudoQueueSetup(){
        PseudoQueue queue = new PseudoQueue();
        System.out.println("Setup complete.");
    }

    @Test
    public void TestConstructor(){
        PseudoQueue queue = new PseudoQueue();
        assertTrue(queue.isStackEmpty(queue.getStack1()));
        assertTrue(queue.isStackEmpty(queue.getStack2()));
    }
}
