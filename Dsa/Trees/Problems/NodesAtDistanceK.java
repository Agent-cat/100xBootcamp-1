package Trees.Problems;

import java.util.*;

public class NodesAtDistanceK {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int count = 0;

    // Count No of Nodes Downwards at Distance k
    public static int f(Node src, int d) {
        if (src == null)
            return 0;
        if (d == 0)
            return 1;
        return f(src.left, d - 1) + f(src.right, d - 1);
    }

    // Finding all Nodes
    public static int NodeAtDistanceK(Node root, Node src, int k) {
        if (root == null)
            return -1;

        if (root == src) {
            count += f(src, k);
            return 0;
        }

        int left = NodeAtDistanceK(root.left, src, k);

        if (left != -1) {
            if (left + 1 == k)
                count++;
            else {
                count += f(root.right, k - left - 2);
            }
            return left + 1;
        }
        int right = NodeAtDistanceK(root.right, src, k);
        if (right != -1) {
            if (right + 1 == k)
                count++;
            else
                count += f(root.left, k - right - 2);

            return right + 1;
        }

        return -1;

    }

    // Find the src Node from s
    public static Node find(Node root, int s) {
        if (root == null)
            return null;
        if (root.data == s)
            return root;
        if (s < root.data)
            return find(root.left, s);
        return find(root.right, s);
    }

    // Insert the data
    public static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data > root.data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int k = sc.nextInt();
            Node root = null;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                root = insert(root, val);
            }
            Node src = find(root, s);
            count = 0;
            NodeAtDistanceK(root, src, k);
            System.out.println(count);
        }
        sc.close();
    }
}
