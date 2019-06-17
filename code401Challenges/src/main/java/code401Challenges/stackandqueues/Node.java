package code401Challenges.stackandqueues;

public class Node<T> {
    public T data;
    protected Node next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
