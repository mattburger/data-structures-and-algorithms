package code401Challenges.tree;

import java.util.ArrayList;

public class BinaryTree {
    TreeNode root;
    private ArrayList<Integer> preOrd;
    private ArrayList<Integer> inOrd;
    private ArrayList<Integer> postOrd;

    public BinaryTree() {
        this.root = null;
        this.preOrd = new ArrayList<>();
        this.inOrd = new ArrayList<>();
        this.postOrd = new ArrayList<>();
    }

    //private methods that preform recursive traversals
    //thanks to geeksforgeeks for reference
    private void preOrder(TreeNode n) {

        if(n == null) {
            return;
        }
        this.preOrd.add(n.data);

        preOrder(n.left);

        preOrder(n.right);

    }

    private void inOrder(TreeNode n) {

        if(n == null) {
            return;
        }

        inOrder(n.left);

        inOrd.add(n.data);

        inOrder(n.right);
    }

    private void postOrder(TreeNode n) {

        if(n == null) {
            return;
        }

        postOrder(n.left);

        postOrder(n.right);

        postOrd.add(n.data);

    }

    //user friendly wrapper methods
    public Integer[] preOrderTraversal() {
        Integer[] output;
        this.preOrd = new ArrayList<>();

        preOrder(this.root);

        output = new Integer[this.preOrd.size()];
        output = this.preOrd.toArray(output);

        return output;

    }

    public Integer[] inOrderTraversal() {
        Integer[] output;
        this.inOrd = new ArrayList<>();

        inOrder(this.root);

        output = new Integer[this.inOrd.size()];
        output = this.inOrd.toArray(output);

        return output;

    }

    public Integer[] postOrderTraversal() {
        Integer[] output;
        this.postOrd = new ArrayList<>();

        postOrder(this.root);

        output = new Integer[this.postOrd.size()];
        output = this.postOrd.toArray(output);

        return output;

    }
}
