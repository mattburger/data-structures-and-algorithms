package code401Challenges;

import code401Challenges.stackandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestQueue {
    @Test
    public void TestConstructor(){
        Queue q = new Queue();

        assertNull("Should be null. ", q.peek());
    }
}
