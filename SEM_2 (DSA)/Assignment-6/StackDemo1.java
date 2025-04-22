import java.util.Scanner;

public class StackDemo1 {
    public static int MAX = 10;
    public static int push(int[] S, int top) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        if (isFull(top)) {
            System.out.println("Stack is full");
            return -1;
        } else {
            S[++top] = sc.nextInt();
            return top;
        }
    }

    public static int pop(int[] S, int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int x = S[top];
            top--;
            return x;
        }
    }

    public static void display(int[] S, int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    top = push(stack, top);
                    break;
                case 2:
                    int x = pop(stack, top);
                    if (x != -1) {
                        System.out.println("The popped element is: " + x);
                    }
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}