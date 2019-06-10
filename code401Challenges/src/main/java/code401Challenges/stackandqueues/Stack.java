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
            Node tmp = this.top;
            this.top = newNode;
            this.top.next = tmp;
        }

        return this;
    }

    public void pop(){
        if(this.top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node tmp = this.top.next;
            this.top = tmp;
        }

    }

    public Object peek(){
        if(this.top == null){
            return null;
        }
        return this.top.data;
    }
}
