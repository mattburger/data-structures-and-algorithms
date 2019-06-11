package code401Challenges.stackandqueues;

public class Queue<T> {
    private Node front;
    private Node back;

    public Queue(){
        this.front = null;
    }

    public void enqueue(T value){
        Node newNode = new Node(value);

        if(this.front == null){
            this.front = newNode;
            this.back = newNode;

        } else {
            this.back.next = newNode;
            this.back = newNode;
        }
    }

    public T dequeue(){
        if(this.front == null){
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        } else if(this.front == this.back){
            Node tmp = this.front;
            this.front = this.back = null;
            return (T)tmp.data;
        } else {
            Node tmp = this.front;
            this.front = this.front.next;
            return (T)tmp.data;
        }
    }

    public T peek(){
        if(this.front == null){
            throw new IllegalStateException("Cannot peek within an empty queue.");
        }
        return (T)this.front.data;
    }

    public Node getFront(){
        return this.front;
    }
}
