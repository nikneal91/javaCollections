package linkedin.javads;


class MyNode  {
    public MyNode left;
    public MyNode right;
    public int data;

    public MyNode(int val) {
        this.data = val;
        this.left=null;
        this.right = null;
    }
    
    
}

class BinaryTree {
    MyNode root;

    public void insert(int value) {
        this.insert(this.root,value);
    }

    private MyNode insert(MyNode root, int value) {
        if ( root == null) {
            root = new MyNode(value);
        } else if ( value < root.data) {
            root.left = this.insert(root.left, value);
            //insert in left half
        } else if (value > root.data) {
            //insert in right half
            root.right = this.insert(root.right, value);
        }
        return root;
    }


}

public class BST {

 public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    MyNode rootData = new MyNode(4);
    tree.root= rootData;
    tree.insert(1);
    tree.insert(2);
    tree.insert(3);    
    tree.insert(8);
 }

}