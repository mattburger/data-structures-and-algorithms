package code401Challenges.graph.getEdge;

import code401Challenges.graph.Edge;
import code401Challenges.graph.Graph;
import code401Challenges.graph.Node;

import java.util.Iterator;

public class GetEdge {
    private Graph routeMap;
    private String[] arr;

    public GetEdge(Graph routeMap, String[] arr) {
        this.routeMap = routeMap;
        this.arr = arr;
    }

    public boolean isDirectRoute() {

        if(this.routeMap.getNodes().isEmpty()) {
            throw new IllegalStateException("Cannot get edges of an empty graph");
        }

        if(this.arr.length < 1) {
            throw new IllegalArgumentException("Input array must not be empty");
        }

        Iterator it  = this.routeMap.getNodes().iterator();
        Node ptr = new Node("Initial");

        while(it.hasNext() && !ptr.getValue().equals(arr[0]) ) {
            ptr = (Node) it.next();
        }
        String nodeVal = ptr.getValue().toString();

        if(!nodeVal.equals(arr[0])) {
            return false;
        }

        it = ptr.getNeighbors().iterator();

        int i = 1;
        while(it.hasNext() && i < this.arr.length) {
            Edge tmp = (Edge) it.next();
            nodeVal = tmp.getDestination().getValue().toString();
            if(nodeVal.equals(arr[i]) ) {
                ptr = tmp.getDestination();
                it = ptr.getNeighbors().iterator();
                i++;
            }
        }

        if(i < arr.length) {
            return false;
        }

        return true;
    }

}
