package code401Challenges.stackandqueues;

public class Stack<T> {
    private Node top;

    public Stack(){
        this.top = null;
    }

    public void push(T value) {
        Node newNode = new Node(value);
        if(this.top == null){
            this.top = newNode;
        } else {
            Node tmp = this.top;
            this.top = newNode;
            this.top.next = tmp;
        }

    }

    public T pop(){
        if(this.top == null) {
            throw new IllegalStateException("Cannot pop from empty stack.");
        } else {
            Node tmp = this.top;
            this.top = tmp.next;

            return (T)tmp.data;
        }

    }

    public T peek(){
        if(this.top == null){
            throw new IllegalStateException("Cannot peek within empty stack.");
        }
        return (T)this.top.data;
    }

    public T getTop(){
        return (T)this.top;
    }
}
