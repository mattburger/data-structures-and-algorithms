package code401Challenges.tree;

public class TreeNode<T> {
    public T data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
