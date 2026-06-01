package LinkedList;

import java.util.Scanner;

public class Main {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Remove first occurrence
    public static Node Remove(Node head, int data) {
        if (head == null)
            return null;
        if (head.data == data)
            return head.next;

        head.next = Remove(head.next, data);
        return head;
    }

    // Insert at end
    public static Node Insert(Node head, int data) {
        if (head == null)
            return new Node(data);

        head.next = Insert(head.next, data);
        return head;
    }

    // Insert at kth index
    public static Node InsertAtK(Node head, int k, int data) {
        if (k == 0) {
            Node nn = new Node(data);
            nn.next = head;
            return nn;
        }

        if (head == null)
            return null;

        head.next = InsertAtK(head.next, k - 1, data);
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;

        for (int i = 0; i < n; i++) {
            head = Insert(head, sc.nextInt());
        }

        int k = sc.nextInt(); // index
        int val = sc.nextInt(); // value to insert

        head = InsertAtK(head, k, val);

        print(head);
        sc.close();
    }
}
