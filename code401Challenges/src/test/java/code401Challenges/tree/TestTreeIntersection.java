package code401Challenges.tree;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

public class TestTreeIntersection {

    @Test
    public void testTreeIntersection() {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(7);
        bt.root.left= new TreeNode(3);
        bt.root.right = new TreeNode(1);
        bt.root.left.left = new TreeNode(5);
        bt.root.left.right = new TreeNode(4);
        bt.root.right.left = new TreeNode(6);
        bt.root.right.right = new TreeNode(2);

        BinaryTree bt2 = new BinaryTree();
        bt2.root = new TreeNode(4);
        bt2.root.left = new TreeNode(5);
        bt2.root.right = new TreeNode(7);
        bt2.root.left.left = new TreeNode(8);
        bt2.root.left.right = new TreeNode(9);
        bt2.root.right.left = new TreeNode(15);
        bt2.root.right.right = new TreeNode(23);

        TreeIntersection treeIntersection = new TreeIntersection(bt, bt2);
        Set<Integer> results = treeIntersection.findTreeIntersection();
        Integer[] resultsArr = new Integer[results.size()];
        int index = 0;

        for(Integer el : results) {
            resultsArr[index++] = el;
        }


        assertArrayEquals("The findIntersection method should have the following values in a set: 4 5 7",
                new Integer[]{4, 5, 7}, resultsArr);

    }

    @Test
    public void testTreeIntersection_oneTreeIsSmaller() {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(3);
        bt.root.left = new TreeNode(1);
        bt.root.right = new TreeNode(4);
        bt.root.left.left = new TreeNode(6);
        bt.root.left.right = new TreeNode(2);

        BinaryTree bt2 = new BinaryTree();
        bt2.root = new TreeNode(23);
        bt2.root.left = new TreeNode(5);
        bt2.root.right = new TreeNode(7);
        bt2.root.left.left = new TreeNode(3);
        bt2.root.left.right = new TreeNode(15);
        bt2.root.right.left = new TreeNode(10);
        bt2.root.right.right = new TreeNode(1);

        TreeIntersection treeIntersection = new TreeIntersection(bt, bt2);
        Set<Integer> results = treeIntersection.findTreeIntersection();
        Integer[] resultsArr = new Integer[results.size()];
        int index = 0;

        for(Integer el : results) {
            resultsArr[index++] = el;
        }


        assertArrayEquals("The findIntersection method should have the following values in a set: 1 3",
                new Integer[]{1, 3}, resultsArr);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testTreeIntersection_oneTreeIsEmpty() {
        BinaryTree bt = new BinaryTree();

        BinaryTree bt2 = new BinaryTree();
        bt2.root = new TreeNode(23);
        bt2.root.left = new TreeNode(5);
        bt2.root.right = new TreeNode(7);
        bt2.root.left.left = new TreeNode(3);
        bt2.root.left.right = new TreeNode(15);
        bt2.root.right.left = new TreeNode(10);
        bt2.root.right.right = new TreeNode(1);

        TreeIntersection treeIntersection = new TreeIntersection(bt, bt2);
        Set<Integer> results = treeIntersection.findTreeIntersection();
        Integer[] resultsArr = new Integer[results.size()];
        int index = 0;

        for(Integer el : results) {
            resultsArr[index++] = el;
        }


        assertArrayEquals("The findIntersection method should have the following values in a set: ",
                new Integer[]{}, resultsArr);

    }

    //methods convertToIntArr() and sort() need to be set to public in order for this test to work
    public void testConvertToIntArr() {
        TreeIntersection ti = new TreeIntersection();

        Integer[] integerTestArr = new Integer[]{5, 4, 3, 2, 1};
        int[] intTestArr = new int[integerTestArr.length];

        intTestArr = ti.convertToIntArr(integerTestArr);
        int[] sortedIntTestArr = ti.sort(intTestArr);

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, intTestArr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedIntTestArr);

    }

}
