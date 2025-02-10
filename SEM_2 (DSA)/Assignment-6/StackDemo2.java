import java.util.Scanner;

public class StackDemo2 {
    static class Node {
        int info;
        Node next;
    }

    public static Node push(Node top) {
        Node newNode = new Node();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to push: ");
        int value = sc.nextInt();
        newNode.info = value;
        newNode.next = top;
        top = newNode;
        return top;
    }

    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            Node temp = top;
            top = top.next;
            return temp;
        }
    }

    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            while (top != null) {
                System.out.print(top.info + " ");
                top = top.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    top = push(top);
                    break;
                case 2:
                    Node temp = pop(top);
                    if (temp != null) {
                        System.out.println("The popped element is: " + temp.info);
                    }
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}