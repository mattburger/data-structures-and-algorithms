package code401Challenges.tree;

import com.sun.source.tree.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBinaryTree {

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

        Integer[] expectedOut = new Integer[]{1, 2, 4, 5, 3, 6, 7};
        Integer[] actualOut = bt.preOrderTraversal();

        assertArrayEquals("preOrderTraversal should output an Integer[] of the preorder traversal sequence.",
                expectedOut, actualOut);

    }

    @Test
    public void testPreOrderTraversal_empty() {
        BinaryTree bt = new BinaryTree();

        Integer[] expectedOutput = new Integer[0];
        Integer[] actualOutput = bt.preOrderTraversal();

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

        Integer[] expectedOut = new Integer[]{4, 2, 5, 1, 6, 3, 7};
        Integer[] actualOut = bt.inOrderTraversal();

        assertArrayEquals("inOrderTraversal should output an Integer[] of the preorder traversal sequence.",
                expectedOut, actualOut);

    }

    @Test
    public void testInOrderTraversal_empty() {
        BinaryTree bt = new BinaryTree();

        Integer[] expectedOutput = new Integer[0];
        Integer[] actualOutput = bt.inOrderTraversal();

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

        Integer[] expectedOut = new Integer[]{4, 5, 2, 6, 7, 3, 1};
        Integer[] actualOut = bt.postOrderTraversal();

        assertArrayEquals("postOrderTraversal should output an Integer[] of the preorder traversal sequence.",
                expectedOut, actualOut);

    }

    @Test
    public void testPostOrderTraversal_empty() {
        BinaryTree bt = new BinaryTree();

        Integer[] expectedOutput = new Integer[0];
        Integer[] actualOutput = bt.postOrderTraversal();

        assertArrayEquals("Empty binary tree should return an empty array.", expectedOutput, actualOutput);
    }
}
