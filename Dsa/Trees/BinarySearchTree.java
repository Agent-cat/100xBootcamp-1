package Trees;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public String toString() {
        return "value =" + this.data;
    }
}

public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        this.root = null;
    }

    // Insert Node
    public TreeNode insert(TreeNode root, int data) {

        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data <= root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;

    }

    // Finding a node
    public TreeNode find(TreeNode root, int data) {
        if (root == null)
            return null;

        if (root.data == data)
            return root;

        if (data < root.data) {
            return find(root.left, data);
        }
        return find(root.right, data);

    }

    // Height -- LEarn again
    public int Height(TreeNode root, int value) {
        if (root == null)
            return -1;
        if (root.left == null && root.right == null)
            return 0;
        return 0;
    }

    // Depth
    public static int Depth(TreeNode root, int value, int depth) {
        if (root == null)
            return -1;

        if (root.data == value)
            return depth;

        if (value < root.data)
            return Depth(root.left, value, depth + 1);
        else
            return Depth(root.right, value, depth + 1);
    }

    // Insert
    static TreeNode insert(int data, TreeNode root) {
        if (root == null)
            return new TreeNode(data);
        if (data < root.data) {
            root.left = insert(data, root.left);
        } else {
            root.right = insert(data, root.right);
        }
        return root;

    }

    // minValue
    static TreeNode Minvalue(TreeNode root) {
        if (root == null)
            return null;
        if (root.left == null)
            return root;
        return Minvalue(root.left);
    }

    public static void main(String[] args) {

        int[] arr = { 7, 3, 8, 9, 4, 7, 10 };
        TreeNode root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(arr[i], root);
        }
        System.out.println(Minvalue(root));
    }

}
