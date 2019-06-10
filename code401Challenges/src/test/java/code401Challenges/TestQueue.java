package code401Challenges;

import code401Challenges.stackandqueues.Node;
import code401Challenges.stackandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestQueue {

    public void enqueueNodes(Queue q, int n){
        for(int i = 1; i <= n; i++){
            q.enqueue(i);
        }
    }

    public void dequeueNodes(Queue q, int n){
        for(int i = 0; i < n; i++){
            q.dequeue();
        }
    }

    @Test
    public void TestConstructor(){
        Queue q = new Queue();

        assertNull("Should be null. ", q.peek());
    }

    @Test
    public void TestEnqueue(){
        Queue q = new Queue();

        enqueueNodes(q, 1);

        assertEquals("Values should be equal.", 1, q.peek());
    }

    @Test
    public void TestEnqueue_multipleEnqueues(){
        Queue q = new Queue();

        enqueueNodes(q, 10);

        assertEquals("Values should be equal.", 1, q.peek());
    }

    @Test
    public void TestDequeue(){
        Queue q = new Queue();

        enqueueNodes(q, 1);
        dequeueNodes(q, 1);

        assertEquals("Values should be equal.", null, q.peek());
    }

    @Test
    public void TestDequeue_valueRemoved(){
        Queue q = new Queue();

        enqueueNodes(q, 2);
        Object removed = q.dequeue();

        assertEquals("Values should be equal", 1, removed);
    }

    @Test
    public void TestDequeue_multipleDequeues(){
        Queue q = new Queue();

        enqueueNodes(q, 10);
        dequeueNodes(q, 5);

        assertEquals("Values should be equal.", 6, q.peek());
    }

}
