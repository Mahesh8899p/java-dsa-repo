public class stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add an element to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Return current size of stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        stack stack = new stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    }
}