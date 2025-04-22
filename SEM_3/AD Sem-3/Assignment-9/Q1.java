import java.util.Stack;
public class Q1 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        System.out.println("Stack: " + myStack);
        String poppedElement = myStack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + myStack);
    }
}
