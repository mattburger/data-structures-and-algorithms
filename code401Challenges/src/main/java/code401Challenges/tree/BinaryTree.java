package code401Challenges.tree;

import java.util.ArrayList;

public class BinaryTree {
    TreeNode root;
    private ArrayList<Integer> preOrd;
    private ArrayList<Integer> inOrd;
    private ArrayList<Integer> postOrd;

    public BinaryTree() {
        this.root = null;
    }

    //private methods that preform recursive traversals
    private void preOrder(TreeNode n) {

        preOrd = new ArrayList<>();
        if(n == null) {
            return;
        }
        this.preOrd.add(n.data);

        preOrder(n.left);

        preOrder(n.right);

    }

    private void inOrder(TreeNode n) {
        inOrd = new ArrayList<>();

        if(n == null) {
            return;
        }

        inOrder(n.left);

        inOrd.add(n.data);

        inOrder(n.right);
    }

    private void postOrder(TreeNode n) {
        postOrd = new ArrayList<>();

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
        preOrder(this.root);

        output = new Integer[this.preOrd.size()];
        output = this.preOrd.toArray(output);

        return output;

    }

    public Integer[] inOrderTraversal() {
        Integer[] output;
        inOrder(this.root);

        output = new Integer[this.inOrd.size()];
        output = this.inOrd.toArray(output);

        return output;

    }

    public Integer[] postOrderTraversal() {
        Integer[] output;
        postOrder(this.root);

        output = new Integer[this.postOrd.size()];
        output = this.postOrd.toArray(output);

        return output;

    }
}
