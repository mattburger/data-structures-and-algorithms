package code401Challenges.graph.depthFirst;

import code401Challenges.graph.Edge;
import code401Challenges.graph.Graph;
import code401Challenges.graph.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class DepthFirst {
    private Graph graph;
    private Stack visted;
    private Stack toVist;
    private ArrayList<Node> preorderList;

    public DepthFirst(Graph graph) {
        this.graph = graph;
        this.visted = new Stack();
        this.toVist = new Stack();
        this.preorderList = new ArrayList<>();
    }

    public ArrayList<Node> depthFirstSearch() {
        Iterator it = this.graph.getNodes().iterator();

        if(!it.hasNext()) {
            throw new IllegalStateException("Cannot traverse when empty.");
        }

        Node current = (Node) it.next();
        ArrayList<Node> neighborList;

        this.visted.push(current);
        this.toVist.push(current);

        while( !this.toVist.isEmpty() ) {

            current = (Node) this.toVist.pop();
            preorderList.add(current);
            neighborList = extractNodes(current);

            if(!neighborList.isEmpty()) {
                for(int i = 0; i < neighborList.size(); i++) {
                    if(!visted.contains(neighborList.get(i) ) ) {
                        this.visted.push(neighborList.get(i) );
                        this.toVist.push(neighborList.get(i) );
                    }
                }
            }
        }

        return preorderList;
    }

    private ArrayList<Node> extractNodes(Node node) {
        HashSet<Edge> edges = node.getNeighbors();
        ArrayList<Node> output = new ArrayList<>();
        ArrayList<Edge> edgesLst = new ArrayList<>(edges);

        for(int i = 0; i < edgesLst.size(); i++) {
            output.add(edgesLst.get(i).getDestination() );
        }

        return output;
    }
}
