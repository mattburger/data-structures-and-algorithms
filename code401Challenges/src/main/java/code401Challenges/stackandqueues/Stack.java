package code401Challenges.stackandqueues;

public class Stack {
    private Node top;

    public Stack(){
        this.top = null;
    }

    public Stack push(Node newNode){
        if(this.top == null){
            this.top = newNode;
        } else {
            this.top.next = top;
            this.top = newNode;
        }

        return this;
    }

    public Stack pop(){
        if(this.top == null) {
            throw new IllegalStateException("Cannot not pop from empty Stack!");
        } else {
            this.top = this.top.next;
        }

        return this;
    }

    public Node peek(){
        return this.top;
    }
}
