package code401Challenges.graph.getEdge;

import code401Challenges.graph.Graph;
import code401Challenges.graph.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestGetEdge {
    @Test
    public void testGetEdge() {
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

        String[] input = new String[]{"a", "b", "c"};

        GetEdge ge = new GetEdge(testGraph, input);

        assertTrue("isDirectRoute should return true.", ge.isDirectRoute());
    }

    @Test
    public void testGetEdge_false() {
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

        String[] input = new String[]{"a", "b", "d"};

        GetEdge ge = new GetEdge(testGraph, input);

        assertFalse("isDirectRoute should return false.", ge.isDirectRoute());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetEdge_emptyGraph() {
        Graph testGraph = new Graph();

        String[] input = new String[]{"a", "b"};

        GetEdge ge = new GetEdge(testGraph, input);

        assertFalse("This assertion won't run", ge.isDirectRoute());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEdge_emptyInput() {
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

        String[] input = new String[]{};

        GetEdge ge = new GetEdge(testGraph, input);

        assertFalse("Will not assert due to exception", ge.isDirectRoute());
    }
}
