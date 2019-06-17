package code401Challenges.tree;

public class BinarySearchTree extends BinaryTree {
    public BinarySearchTree(Integer data) {
        super();
    }

    private TreeNode add(TreeNode n, Integer value) {

        if(n == null) {
            n = new TreeNode(value);
        }

        if(n.data < value) {
            n.right = add(n.right, value);
        } else if(n.data > value){
            n.left = add(n.left, value);
        }

        return n;
    }

    public boolean contains(TreeNode n, Integer value, boolean flag) {
        if(n == null) {
            return flag;
        }

        contains(n.left, value, flag);
        if(n.data == value) {
            flag = true;
        }
        contains(n.right, value, flag);
        
        return flag;
    }
}
