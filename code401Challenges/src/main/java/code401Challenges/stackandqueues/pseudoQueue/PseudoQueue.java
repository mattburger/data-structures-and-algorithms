package code401Challenges.stackandqueues.pseudoQueue;

import code401Challenges.stackandqueues.Stack;

public class PseudoQueue {
    protected Stack s1;
    protected Stack s2;

    public PseudoQueue(){
        s1 = new Stack();
        s2 = new Stack();
    }

    public boolean isEmpty(Stack s){
        if(s.getTop() == null){
            return true;
        }
        return false;
    }
}
