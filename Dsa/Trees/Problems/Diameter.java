package Trees.Problems;

public class Diameter {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    /*
     * static int height(Node root) {
     * if (root == null)
     * return 0;
     * int leftHeight = height(root.left);
     * int rightHeight = height(root.right);
     *
     * return Math.max(leftHeight, rightHeight) + 1;
     * }
     *
     * static int diameter(Node root) {
     * if (root == null)
     * return 0;
     * int leftDia = diameter(root.left);
     * int rightDia = diameter(root.right);
     * int myDia = height(root.left) + height(root.right) + 1;
     * return Math.max(leftDia, Math.max(rightDia, myDia));
     *
     * }
     *
     */

    static class Pair {
        int diameter;
        int height;

        Pair(int d, int h) {
            this.diameter = d;
            this.height = h;
        }
    }

    static Pair diameter(Node root) {
        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = diameter(root.left);
        Pair right = diameter(root.right);

        int height = Math.max(left.height, right.height) + 1;

        int dia1 = left.diameter;
        int dia2 = right.diameter;
        int myDia = left.height + right.height + 1;

        int diameter = Math.max(myDia, Math.max(dia1, dia2));

        return new Pair(diameter, height);
    }

    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int i : arr) {
            root = insert(root, i);
        }
        System.out.println(diameter(root));
    }

}
