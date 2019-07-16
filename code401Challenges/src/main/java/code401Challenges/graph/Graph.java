package code401Challenges.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph<T> {
    private T data;
    private List<Edge> edges;
    private List neighbors;
    private List allNodes;

    public Graph(T data) {
        this.data = data;
        this.neighbors = new LinkedList();
        this.allNodes = new ArrayList();
    }

    public Graph addNode(Graph node) {
        if(!this.neighbors.contains(node)) {
            this.neighbors.add(node);
            node.neighbors.add(this);

            this.addEdge(this, node, 100);
        }

        return node;
    }

    public void addEdge(Graph src, Graph dest, int weight) {
        src.edges.add(new Edge(src, dest, weight) );
    }


    //Getters
    public T getData() {
        return this.data;
    }

    public List getNeighbors() {
        return this.neighbors;
    }

    //Setters
    public void setData(T data) {
        this.data = data;
    }

    public void setNeighbors(List neighbors) {
        this.neighbors = neighbors;
    }
}
