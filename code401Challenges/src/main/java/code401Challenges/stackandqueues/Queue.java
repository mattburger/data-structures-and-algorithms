package code401Challenges.stackandqueues;

public class Queue {
    private Node front;

    public Queue(){
        this.front = null;
    }

    public Queue enqueue(Node newNode){
        return this;
    }

    public Queue Dequeue(){
        return this;
    }

    public Node peek(){
        return this.front;
    }
}
