package code401Challenges.graph;

import code401Challenges.breadthFirst.BreadthFirst;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestBreadthFirst {

    @Test
    public void testBreadthFirst() {
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');

        a.addEdge(b, 1);
        b.addEdge(c, 2);
        c.addEdge(d, 3);
        d.addEdge(a, 4);

        BreadthFirst bf = new BreadthFirst(a);
        List<Node> lst = bf.breadthFirstSearch();

        assertEquals("The returned list should be of size 4", 4, lst.size());
        assertEquals("The first value stored in the return List should be 'a'.", 'a', lst.get(0).getValue());
    }

    @Test(expected = IllegalStateException.class)
    public void testBreadthFirst_fail() {
        Node a = null;

        BreadthFirst bf = new BreadthFirst(a);
        List<Node> lst = bf.breadthFirstSearch();

        assertEquals("Will not run.", 4, lst.size());
    }
}
