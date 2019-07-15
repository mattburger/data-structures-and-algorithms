package code401Challenges.graph;

import code401Challenges.LinkedList.LinkedList;

public class GraphNode<T> {
    private T data;
    private LinkedList neighbors;

    public GraphNode(T data) {
        this.data = data;
        this.neighbors = new LinkedList();
    }

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
