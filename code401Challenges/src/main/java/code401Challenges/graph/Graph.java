package code401Challenges.graph;

public class Graph<T> {
    private GraphNode vertix;

    public Graph(GraphNode vertix) {
        this.vertix = vertix;
    }

    public GraphNode addNode(GraphNode node) {
        this.vertix.getNeighbors().append(node);

        return node;
    }

    public void addEdge(GraphNode a, GraphNode b) {
        if(!a.getNeighbors().linkedListIncludes(b) ) {
            a.getNeighbors().append(b);
        }
    }
}
