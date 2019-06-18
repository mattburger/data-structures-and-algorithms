package code401Challenges.fizzbuzzTree;

import code401Challenges.tree.BinaryTree;
import code401Challenges.tree.TreeNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFizzBuzzTree<T> {
    @Test
    public void testFizzBuzzTree() {
        FizzBuzzTree fbt = new FizzBuzzTree();
        BinaryTree output;

        fbt.root = new TreeNode(7);
        fbt.root.left = new TreeNode(10);
        fbt.root.right = new TreeNode(15);
        fbt.root.left.left = new TreeNode(20);
        fbt.root.left.right = new TreeNode(45);
        fbt.root.right.left = new TreeNode(51);
        fbt.root.right.right = new TreeNode(71);
        //preorder = 7, 10, 20, 45, 15, 51, 63 = 7, Buzz, Buzz, FizzBuzz, FizzBuzz, Fizz, 71,
        output = fbt.fizzBuzzTree();
        T[] expectedOutput = (T[])new Object[]{7, "Buzz", "Buzz", "FizzBuzz", "FizzBuzz", "Fizz", 71};
        T[] actualOutput = (T[]) output.preOrderTraversal();


        assertArrayEquals("fizzBuzzTree() should return an generic array.", expectedOutput, actualOutput);
    }

}
