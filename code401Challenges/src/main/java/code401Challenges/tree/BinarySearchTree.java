package code401Challenges.tree;



public class BinarySearchTree extends BinaryTree {
    public BinarySearchTree() {
        super();
    }

    //Thanks to geeksforgeeks
    private TreeNode addNode(TreeNode n, Integer value) {

        if(n == null) {
            n = new TreeNode(value);
            return n;
        }

        if(n.data < value) {
            n.right = addNode(n.right, value);
        } else if(n.data > value){
            n.left = addNode(n.left, value);
        }

        return n;
    }


    private boolean contains(TreeNode n, Integer value) {
        boolean flag = false;
        if(n == null) {
            return flag;
        }

        if(n.data == value) {
            flag = true;
            return flag;
        }

        if(value < n.data) {
            return contains(n.left, value);
        }


        return contains(n.right, value);

    }

    public boolean contains(Integer value) {
        return contains(this.root, value);
    }

    public Integer[] add(Integer value) {
        Integer[] output;

        this.root = addNode(this.root, value);

        output = inOrderTraversal();

        return output;
    }
}
