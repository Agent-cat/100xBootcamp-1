package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversals {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            System.out.print(cur.data + " ");
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }

    }

    static Node insert(int data, Node root) {
        if (root == null)
            return new Node(data);
        if (data < root.data) {
            root.left = insert(data, root.left);
        } else {
            root.right = insert(data, root.right);
        }
        return root;

    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 8, 1, 4, 7, 10 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(arr[i], root);
        }
        System.out.println("Preorder : ");
        preOrder(root);
        System.out.println();
        System.err.println("Inorder : ");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder : ");
        postOrder(root);
        System.out.println();
        System.out.println("LevelOrder : ");
        levelOrder(root);
    }
}
