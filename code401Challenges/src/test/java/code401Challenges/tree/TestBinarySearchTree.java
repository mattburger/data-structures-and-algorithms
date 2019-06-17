package code401Challenges.tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBinarySearchTree {

    @Test
    public void testAdd() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(1);

        Integer expected = 1;

        assertEquals("Binary tree left and right should have a value when added to the tree, or point to null.",
                expected, bst.root.data);
    }

    @Test
    public void testAdd_many() {
        BinarySearchTree bst = new BinarySearchTree();

        for(int i = 1; i <= 10; i++) {
            bst.add(i);
        }
        Integer[] expected = new Integer[]{};
        Integer[] actual = bst.inOrderTraversal();


        assertArrayEquals("Binary tree left and right should have a value when added to the tree, or point to null.",
                expected, actual);
    }

    @Test
    public void testContains() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(1);
        bst.add(2);
        bst.add(3);
        bst.add(4);
        bst.add(5);

        assertTrue("contains should return true if the value exists in the tree, and false otherwise.", bst.contains(5));
        assertFalse("contains should return true if the value exists in the tree, and false otherwise.", bst.contains(10));

    }
}
