package code401Challenges.tree;

import code401Challenges.stackandqueues.Queue;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class BinaryTree<T> {
    public TreeNode root;
    private ArrayList<T> preOrd;
    private ArrayList<T> inOrd;
    private ArrayList<T> postOrd;

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
        this.preOrd.add((T)n.data);

        preOrder(n.left);

        preOrder(n.right);

    }

    private void inOrder(TreeNode n) {

        if(n == null) {
            return;
        }

        inOrder(n.left);

        inOrd.add((T)n.data);

        inOrder(n.right);
    }

    private void postOrder(TreeNode n) {

        if(n == null) {
            return;
        }

        postOrder(n.left);

        postOrder(n.right);

        postOrd.add((T)n.data);

    }

    public void breadthFirstTraversal(TreeNode n) {
        Queue q = new Queue();
        q.enqueue(this.root);
    }

    //user friendly wrapper methods
    public T[] preOrderTraversal() {
        T[] output;
        this.preOrd = new ArrayList<>();

        preOrder(this.root);

        output = (T[])new Object[this.preOrd.size()];
        output = this.preOrd.toArray(output);

        return output;

    }

    public T[] inOrderTraversal() {
        T[] output;
        this.inOrd = new ArrayList<>();

        inOrder(this.root);

        output = (T[])new Object[this.inOrd.size()];
        output = this.inOrd.toArray(output);

        return output;

    }

    public T[] postOrderTraversal() {
        T[] output;
        this.postOrd = new ArrayList<>();

        postOrder(this.root);

        output = (T[])new Object[this.postOrd.size()];
        output = this.postOrd.toArray(output);

        return output;

    }

}
