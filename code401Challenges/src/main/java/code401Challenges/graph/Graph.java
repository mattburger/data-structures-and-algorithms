package code401Challenges.graph;

import java.util.*;

public class Graph<T> {
    private HashSet<Node> nodes;
    int size;

    public Graph() {
        this.nodes = new HashSet<>();
        this.size = 0;
    }

    public Node addNode( Node node) {
        this.nodes.add(node);
        this.size++;

        return node;
    }

    public HashSet<Node> getNodes() {
        return this.nodes;
    }

    public int size() {
        return this.size;
    }

    public List<Node> breadthFirstSearch() {
        List<Node> result = new ArrayList<>();
        List<Node> visted = new ArrayList<>();
        Queue toVisit = new Queue;

        

        return result;
    }
}
