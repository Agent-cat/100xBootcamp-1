package LinkedList;

import java.util.Scanner;

public class LList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node DeleteHead(Node head) {
        if (head == null)
            return head;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;

    }

    public static void Show(Node head) {
        Node mover = head;
        while (mover != null) {
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }

    public static Node Insert(int data, Node head) {
        if (head == null)
            return new Node(data);

        head.next = Insert(data, head.next);
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = Insert(sc.nextInt(), head);
        }
        Show(head);
        head = DeleteHead(head);
        Show(head);
        System.out.println();
        sc.close();

    }
}
