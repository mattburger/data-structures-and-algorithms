package code401Challenges.graph;

import java.util.*;

public class Graph<T> {
    private T data;
    private LinkedList<Edge> neighbors;
    private List allNodes;

    public Graph(T data) {
        this.data = data;
        this.neighbors = new LinkedList();
        this.allNodes = new ArrayList();
    }

    public Graph addNode(Graph node, int weight) {
        if(!this.neighbors.contains(node)) {
            this.neighbors.add(new Edge(node, weight) );
            node.neighbors.add(new Edge(this, weight) );
        }

        return node;
    }

    public Edge addEdge(Graph dest, int weight) {
        return new Edge(dest, weight);
    }

    public List<Graph> getNeighbors(Graph node) {
        return node.neighbors;
    }

    public List<Graph> getNodes(Graph node) {
        List<Graph> allNodes;
        Stack<Graph> visted = new Stack<>();
        Stack<Graph> toVist = new Stack<>();

        visted.push(node);
        toVist.push(node);

        while( !toVist.isEmpty() ) {
            if( !toVist.peek().neighbors.isEmpty() ) {
                 LinkedList<Edge> currentNodeNeighbors = toVist.peek().neighbors;
                 Graph tmpNode = currentNodeNeighbors.poll().getDestination();

                 while( visted.contains(tmpNode) && !currentNodeNeighbors.isEmpty() ) {
                     tmpNode = currentNodeNeighbors.poll().getDestination();
                 }

                 if(currentNodeNeighbors.isEmpty()) {
                     toVist.pop();
                 }

                 else if( !visted.contains(tmpNode) ) {
                     visted.add(tmpNode);
                     toVist.push(tmpNode);
                 } else {
                     tmpNode = currentNodeNeighbors.poll().getDestination();
                 }
            } else {
                toVist.pop();
            }
        }

        allNodes = new ArrayList<>(visted);

        return allNodes;
    }

    public int size() {
        return getNodes(this).size();
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

    public void setNeighbors(LinkedList neighbors) {
        this.neighbors = neighbors;
    }
}
