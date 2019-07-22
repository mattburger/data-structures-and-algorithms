package code401Challenges.graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestGraph {

    @Test
    public void testGraph() {
        Graph testGraph = new Graph();
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');

        a.addEdge(b, 1);
        b.addEdge(c, 2);
        c.addEdge(d, 3);
        d.addEdge(a, 4);

        testGraph.addNode(a);
        testGraph.addNode(b);
        testGraph.addNode(c);
        testGraph.addNode(d);


        assertEquals("The value of this Node should be 'e'", 'e', testGraph.addNode(new Node('e')).value);
        assertEquals("The size should be equal to 5", 5, testGraph.size());
        assertEquals("getNodes should return a list of size 5", 5, testGraph.getNodes().size());

    }
}
