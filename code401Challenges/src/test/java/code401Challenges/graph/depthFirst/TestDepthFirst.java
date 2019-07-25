package code401Challenges.graph.depthFirst;

import code401Challenges.graph.Graph;
import code401Challenges.graph.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDepthFirst {

    @Test
    public void testDepthFirst_happy() {
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

        DepthFirst df = new DepthFirst(testGraph);

        assertEquals("The size of the ArrayList returned should be 4.", 4, df.depthFirstSearch().size());
        assertEquals("The first value in the returned list should be 'c'.",
                'c', df.depthFirstSearch().get(0).getValue());
    }

    @Test(expected = IllegalStateException.class)
    public void testDepthFirst_exception() {
        Graph testGraph = new Graph();

        DepthFirst df = new DepthFirst(testGraph);
        ArrayList<Node> lst = df.depthFirstSearch();
        assertEquals("This assertion will not assert", 4, lst);
    }

    @Test
    public void testDepthFirst_oneNode() {
        Graph testGraph = new Graph();

        Node a = new Node('a');

        testGraph.addNode(a);

        DepthFirst df = new DepthFirst(testGraph);

        assertEquals("The dephFirst method should return an ArrayList with only the value 'a' in it",
                'a', df.depthFirstSearch().get(0).getValue());

    }
}

