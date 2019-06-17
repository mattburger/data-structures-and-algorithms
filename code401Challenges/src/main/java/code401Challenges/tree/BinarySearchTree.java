package code401Challenges.tree;



public class BinarySearchTree<T> extends BinaryTree {
    public BinarySearchTree() {
        super();
    }

    //Thanks to geeksforgeeks
    private TreeNode addNode(TreeNode n, T value) {

        if(n == null) {
            n = new TreeNode(value);
            return n;
        }

        if((Integer)n.data < (Integer)value) {
            n.right = addNode(n.right, value);
        } else if((Integer)n.data > (Integer)value){
            n.left = addNode(n.left, value);
        }

        return n;
    }


    private boolean contains(TreeNode n, T value) {
        boolean flag = false;
        if(n == null) {
            return flag;
        }

        if(n.data == value) {
            flag = true;
            return flag;
        }

        if((Integer)value < (Integer)n.data) {
            return contains(n.left, value);
        }


        return contains(n.right, value);

    }

    public boolean contains(T value) {
        return contains(this.root, value);
    }

    public T[] add(T value) {
        T[] output;

        this.root = addNode(this.root, value);

        output = (T[])inOrderTraversal();

        return output;
    }
}
