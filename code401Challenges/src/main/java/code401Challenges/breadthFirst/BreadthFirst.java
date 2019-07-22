package code401Challenges.breadthFirst;

import code401Challenges.graph.Edge;
import code401Challenges.graph.Node;
import code401Challenges.stackandqueues.Queue;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirst {
    private Node node;

    public BreadthFirst(Node node) {
        this.node = node;
    }

    public List<Node> breadthFirstSearch() {
        if(this.node == null) {
            throw new IllegalStateException("Search cannot be done on null");
        }
        List<Node> result = new ArrayList<>();
        Queue toVisit = new Queue();

        toVisit.enqueue(this.node);
        result.add(this.node);

        if(this.node.getNeighbors().size() < 1) {
            return result;
        }

        Node tmp = new Node("initial");
        while(toVisit.getFront() != null) {
            tmp = (Node) toVisit.dequeue();

            if(!tmp.getNeighbors().isEmpty()) {
                List<Edge> tmpNeighbors = new ArrayList<>(tmp.getNeighbors());

                for(int i = 0; i < tmpNeighbors.size(); i++) {
                    if( !result.contains( tmpNeighbors.get(i).getDestination()) ) {
                        toVisit.enqueue(tmpNeighbors.get(i).getDestination());
                        result.add(tmpNeighbors.get(i).getDestination());
                    }
                }
            }
        }

        String output = "";
        for(int i = 0; i < result.size(); i++) {
            output = output + result.get(i).getValue() + ", ";
        }

        output = output.substring(0, output.length() - 2);
        System.out.println(output);
        return result;
    }
}
