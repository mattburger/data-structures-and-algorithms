package code401Challenges.stackandqueues;

public class Queue {
    private Node front;
    private Node back;

    public Queue(){
        this.front = null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);

        if(this.front == null){
            this.front = newNode;
            this.back = newNode;

        } else {
            this.back.next = newNode;
            this.back = newNode;
        }
    }

    public Object dequeue(){
        if(this.front == null){
            return null;
        }
        Node tmp = this.front;
        this.front = this.front.next;
        return tmp.data;
    }

    public Object peek(){
        if(this.front == null){
            return null;
        }
        return this.front.data;
    }
}
