package code401Challenges;

import code401Challenges.stackandqueues.Stack;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class TestStack {
    @Test
    public void TestConstructor(){
        Stack s = new Stack();

        assertNull("Should be null. ", s.peek());
    }
}
