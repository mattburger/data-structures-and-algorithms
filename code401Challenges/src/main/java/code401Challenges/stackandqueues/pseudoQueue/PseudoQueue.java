package code401Challenges.stackandqueues.pseudoQueue;

import code401Challenges.stackandqueues.Node;
import code401Challenges.stackandqueues.Stack;

public class PseudoQueue<T> {
    protected Stack s1;
    protected Stack s2;

    public PseudoQueue(){
        s1 = new Stack();
        s2 = new Stack();
    }

    public boolean isStackEmpty(Stack s){
        if(s.getTop() == null){
            return true;
        }
        return false;
    }

    public Stack getStack1(){
        return this.s1;
    }

    public Stack getStack2(){
        return this.s2;
    }

    public void enqueue(T value){

        if(isStackEmpty(s2)){
            s2.push(value);
        } else {
            while(s2.getTop() != null){
                s1.push( s2.pop() );
            }
            s1.push(value);

            while(s1.getTop() != null){
                s2.push( s1.pop() );
            }
        }
    }


}
