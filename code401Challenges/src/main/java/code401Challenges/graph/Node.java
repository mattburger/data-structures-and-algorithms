package code401Challenges.graph;

import java.util.HashSet;

public class Node<T> {
    T value;
    HashSet<Edge> edges;

    public Node(T value) {
        this.value = value;
        this.edges = new HashSet<>();
    }

    public HashSet<Edge> getNeighbors() {
        return edges;
    }

    public void addEdge(Node destination, int weight) {
        Edge newEdge = new Edge(destination, weight);
        Edge runBack = new Edge(this, weight);
        edges.add(newEdge);
        destination.edges.add(runBack);
    }

    public T getValue() {
        return this.value;
    }
}
