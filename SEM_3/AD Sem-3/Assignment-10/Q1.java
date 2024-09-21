class SimpleStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    SimpleStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}