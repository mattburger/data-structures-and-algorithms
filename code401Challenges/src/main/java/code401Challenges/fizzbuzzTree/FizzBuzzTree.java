package code401Challenges.fizzbuzzTree;

import code401Challenges.tree.BinaryTree;
import code401Challenges.tree.TreeNode;

public class FizzBuzzTree extends BinaryTree {

    public FizzBuzzTree() {
        super();

    }

    public void fizzBuzzTree(TreeNode n) {
        if(n == null) {
            return;
        }
        if(((Integer) n.data % 5 == 0) && ((Integer)n.data % 3 == 0) ) {
            n.data = "FizzBuzz";
        }
        else if((Integer)n.data % 5 == 0) {
            n.data = "Buzz";
        }
        else if((Integer)n.data % 3 == 0) {
            n.data = "Fizz";
        }
        fizzBuzzTree(n.left);
        fizzBuzzTree(n.right);
    }

    public BinaryTree fizzBuzzTree() {
        fizzBuzzTree(this.root);
        BinaryTree output = new BinaryTree();
        output.root = this.root;
        return output;
    }
}
