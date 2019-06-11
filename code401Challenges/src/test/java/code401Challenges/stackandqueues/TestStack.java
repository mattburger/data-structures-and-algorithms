package code401Challenges.stackandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStack {
    public void addNodes(Stack s, int n){
        for(int i = 1; i <= n; i++){
            s.push(i);
        }
    }
    public void popNodes(Stack s, int n){
        for(int i = 0; i < n; ++i){
            s.pop();
        }
    }

    @Test
    public void TestConstructor() {
        Stack s = new Stack();

        assertNull("Should be null. ", s.getTop());
    }

    @Test(expected = IllegalStateException.class)
    public void TestConstructor_fail(){
        Stack s = new Stack();

        assertNull("Should be null. ", s.peek());
    }

    @Test
    public void TestPushAndPeek(){
        Stack s = new Stack();
        s.push(1);

        assertEquals("Values should be equal. ", 1, s.peek());
    }

    @Test
    public void TestPush_multiple(){
        Stack s = new Stack();
        addNodes(s, 5);

        assertEquals("Values should be equal. ", 5, s.peek());
    }

    @Test
    public void TestPop(){
        Stack s = new Stack();
        addNodes(s, 5);
        s.pop();

        assertEquals("Values should be equal. ", 4, s.peek());
    }

    @Test
    public void TestPopToEmpty(){
        Stack s = new Stack();
        addNodes(s, 5);
        popNodes(s,5);


        assertEquals("Values should be equal. ", null, s.getTop());
    }

    @Test(expected = IllegalStateException.class)
    public void TestPopToEmpty_fail(){
        Stack s = new Stack();
        addNodes(s, 5);
        popNodes(s,5);


        assertEquals("Values should be equal. ", null, s.peek());
    }

}
