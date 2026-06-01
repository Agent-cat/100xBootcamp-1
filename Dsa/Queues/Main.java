package Queues;

class Queues {
    int items[];
    int size;
    int top;
    int bottom;

    public Queues(int size) {
        this.size = size;
        this.items = new int[size];
        this.top = 0;
        this.bottom = 0;
    }

    public void Enqueue(int value) {
        if (bottom == size) {
            System.out.println("Queue is Full");
            return;
        }
        items[bottom] = value;
        bottom++;
    }

    public void Dequeue() {
        if (top == bottom) {
            System.out.println("Queue is Empty");
            return;
        }
        int element = items[top];
        top++;
        System.out.println("Dequeue" + element);
    }
}

public class Main {

}
