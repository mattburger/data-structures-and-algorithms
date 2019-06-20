package code401Challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestBinaryTree<T> {

    @Test
    public void testBinaryTree() {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(5);
        bt.root.left = new TreeNode(1);
        bt.root.right = new TreeNode(2);
        Integer rootExpected = 5;
        Integer leftExpected = 1;
        Integer rightExpected = 2;

        assertEquals("Binary tree left and right should have a value when added to the tree, or point to null.",
                rootExpected, bt.root.data);
        assertEquals("Binary tree left and right should have a value when added to the tree, or point to null.",
                leftExpected, bt.root.left.data);
        assertEquals("Binary tree left and right should have a value when added to the tree, or point to null.",
                rightExpected, bt.root.right.data);
    }

    @Test(expected = NullPointerException.class)
    public void testBinaryTree_empty() {
        BinaryTree bt = new BinaryTree();

        assertNull("On initial instantiation, the binary tree should have null values for its data, left and right.",
                bt.root);
        assertNull("On initial instantiation, the binary tree should have null values for its data, left and right.",
                bt.root.left);
        assertNull("On initial instantiation, the binary tree should have null values for its data, left and right.",
                bt.root.right);


    }

    @Test
    public void testPreOrderTraversal() {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(1);
        bt.root.left = new TreeNode(2);
        bt.root.right = new TreeNode(3);
        bt.root.left.left = new TreeNode(4);
        bt.root.left.right = new TreeNode(5);
        bt.root.right.left = new TreeNode(6);
        bt.root.right.right = new TreeNode(7);

        T[] expectedOut = (T[])new Object[]{1, 2, 4, 5, 3, 6, 7};
        T[] actualOut = (T[])bt.preOrderTraversal();

        assertArrayEquals("preOrderTraversal should output an Integer[] of the preorder traversal sequence.",
                expectedOut, actualOut);

    }

    @Test
    public void testPreOrderTraversal_empty() {
        BinaryTree bt = new BinaryTree();

        T[] expectedOutput = (T[])new Object[0];
        T[] actualOutput = (T[])bt.preOrderTraversal();

        assertArrayEquals("Empty binary tree should return an empty array.", expectedOutput, actualOutput);
    }

    @Test
    public void testInOrderTraversal() {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(1);
        bt.root.left = new TreeNode(2);
        bt.root.right = new TreeNode(3);
        bt.root.left.left = new TreeNode(4);
        bt.root.left.right = new TreeNode(5);
        bt.root.right.left = new TreeNode(6);
        bt.root.right.right = new TreeNode(7);

        T[] expectedOut = (T[])new Object[]{4, 2, 5, 1, 6, 3, 7};
        T[] actualOut = (T[])bt.inOrderTraversal();

        assertArrayEquals("inOrderTraversal should output an Integer[] of the preorder traversal sequence.",
                expectedOut, actualOut);

    }

    @Test
    public void testInOrderTraversal_empty() {
        BinaryTree bt = new BinaryTree();

        T[] expectedOutput = (T[])new Object[0];
        T[] actualOutput = (T[])bt.inOrderTraversal();

        assertArrayEquals("Empty binary tree should return an empty array.", expectedOutput, actualOutput);
    }

    @Test
    public void testPostOrderTraversal() {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(1);
        bt.root.left = new TreeNode(2);
        bt.root.right = new TreeNode(3);
        bt.root.left.left = new TreeNode(4);
        bt.root.left.right = new TreeNode(5);
        bt.root.right.left = new TreeNode(6);
        bt.root.right.right = new TreeNode(7);

        T[] expectedOut = (T[]) new Object[]{4, 5, 2, 6, 7, 3, 1};
        T[] actualOut = (T[]) bt.postOrderTraversal();

        assertArrayEquals("postOrderTraversal should output an Integer[] of the preorder traversal sequence.",
                expectedOut, actualOut);

    }

    @Test
    public void testPostOrderTraversal_empty() {
        BinaryTree bt = new BinaryTree();

        T[] expectedOutput = (T[]) new Object[0];
        T[] actualOutput = (T[]) bt.postOrderTraversal();

        assertArrayEquals("Empty binary tree should return an empty array.", expectedOutput, actualOutput);
    }

    @Test
    public void testBreadthFirstTraversal() {
        BinaryTree bt = new BinaryTree();

        bt.root = new TreeNode(1);
        bt.root.left = new TreeNode(2);
        bt.root.right = new TreeNode(3);
        bt.root.left.left = new TreeNode(4);
        bt.root.left.right = new TreeNode(5);
        bt.root.right.left = new TreeNode(6);
        bt.root.right.right = new TreeNode(7);

        String actual = bt.breadthFirstTraversal(bt.root);
        String expected = "1234567";

        assertEquals("Breadth first should return a string of the node values by level", expected, actual);
    }

    @Test
    public void testBreadthFirstTraversal_empty() {
        BinaryTree bt = new BinaryTree();

        String actual = bt.breadthFirstTraversal(bt.root);
        String expected = "Tree is empty!";

        assertEquals("Breadth first should return a string of the node values by level", expected, actual);
    }

    @Test
    public void testFindMaximumValue() {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(1);
        bt.root.left = new TreeNode(2);
        bt.root.right = new TreeNode(3);
        bt.root.left.left = new TreeNode(4);
        bt.root.left.right = new TreeNode(5);
        bt.root.right.left = new TreeNode(6);
        bt.root.right.right = new TreeNode(7);

        Integer expected = 7;
        Integer actual = bt.findMaximumValue();

        assertEquals("findMaximumValue should return the maximum Integer in the tree.", expected, actual);
    }

    @Test
    public void testFindMaximumValue_emptyTree() {
        BinaryTree bt = new BinaryTree();

        Integer expected = Integer.MIN_VALUE;
        Integer actual = bt.findMaximumValue();

        assertEquals("findMaximumValue will return the smallest Integer in java if the tree is empty.",
                expected, actual);
    }

    @Test(expected = Exception.class)
    public void testFindMaximumValue_char() {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode('A');
        bt.root.left = new TreeNode('B');
        bt.root.right = new TreeNode('C');
        bt.root.left.left = new TreeNode('D');
        bt.root.left.right = new TreeNode('E');
        bt.root.right.left = new TreeNode('F');
        bt.root.right.right = new TreeNode('G');

        Character expected = 'G';
        T actual = (T)bt.findMaximumValue();

        assertEquals("findMaximumValue should return the maximum Integer in the tree.", expected, actual);
    }

}
