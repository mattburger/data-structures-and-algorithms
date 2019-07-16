package code401Challenges.graph;

import code401Challenges.LinkedList.LinkedList;
import code401Challenges.stackandqueues.Node;

public class GraphNode<T> extends Node {
    private T data;
    private LinkedList neighbors;

    public GraphNode(T data) {
        super(data);
        this.neighbors = new LinkedList();
    }g

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedList getNeighbors() {
        return this.neighbors;
    }

    public void setNeighbors(LinkedList neighbors) {
        this.neighbors = neighbors;
    }
}
