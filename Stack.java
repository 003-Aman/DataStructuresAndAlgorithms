class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    Stack(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Stack size must be positive");
        }
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements into stack
    public void push(int x) {
        if (isFull()) {
            throw new IllegalStateException("Overflow: Stack is full, cannot add more elements");
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Underflow: Stack is empty, cannot remove elements");
        }
        return arr[top--];
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Print all elements in the stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    // Main method to test the stack operations
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);

            stack.pop();
            System.out.println("\nAfter popping out");
            stack.printStack();

            // Uncomment below lines to test the exception handling.
            // stack.push(5);
            // stack.push(6); // This should cause an exception
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
