package Stack;

class Stack {

    private int items[];
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }

    // Push Element
    public void push(int value) {
        if (top == size) {
            System.out.println("Stack is full");
            return;
        }
        items[top] = value;
        top++;
    }

    // POP element from an atrray
    public void pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
        int element = items[top];
        System.out.println("Pop : " + element);
        return;
    }

    // Peek
    public void peek() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return;
        } else {
            System.out.println(items[top]);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        st.pop();
        st.pop();
        st.peek();

    }

}
