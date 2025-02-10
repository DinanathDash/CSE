import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    }
}

public class DLinkedList {
    public static Node create(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the registration number and mark of student " + (i + 1) + ": ");
            int regd_no = sc.nextInt();
            float mark = sc.nextFloat();
            Node newNode = new Node(regd_no, mark);
            if (start == null) {
                start = newNode;
                end = newNode;
            } else {
                end.next = newNode;
                newNode.prev = end;
                end = newNode;
            }
        }
        return end;
    }

    public static void display(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = start;
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + ", Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static Node insBeg(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number and mark of student: ");
        int regd_no = sc.nextInt();
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return start;
    }

    public static Node insEnd(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number and mark of student: ");
        int regd_no = sc.nextInt();
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return end;
    }

    public static Node insAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position at which to insert: ");
        int pos = sc.nextInt();
        if (pos == 1) {
            return insBeg(start, end);
        }
        int count = 1;
        Node temp = start;
        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Invalid position.");
            return start;
        }
        System.out.println("Enter the registration number and mark of student: ");
        int regd_no = sc.nextInt();
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start == end) {
            start = null;
            end = null;
            return start;
        }
        start = start.next;
        start.prev = null;
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start == end) {
            start = null;
            end = null;
            return start;
        }
        end = end.prev;
        end.next = null;
        return end;
    }

    public static Node delAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position at which to delete: ");
        int pos = sc.nextInt();
        if (pos == 1) {
            return delBeg(start, end);
        }
        int count = 1;
        Node temp = start;
        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position.");
            return start;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return start;
    }

    public static void search(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number to search: ");
        int regd_no = sc.nextInt();
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == regd_no) {
                System.out.println("Student found. Enter new mark: ");
                float mark = sc.nextFloat();
                temp.mark = mark;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        Node end = null;
        while (true) {
            System.out.println("****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at beginning");
            System.out.println("4: Insert at end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete from beginning");
            System.out.println("7: Delete from end");
            System.out.println("8: Delete from any position");
            System.out.println("9: Search and update");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    end = create(start, end);
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = insBeg(start, end);
                    break;
                case 4:
                    end = insEnd(start, end);
                    break;
                case 5:
                    start = insAny(start, end);
                    break;
                case 6:
                    start = delBeg(start, end);
                    break;
                case 7:
                    end = delEnd(start, end);
                    break;
                case 8:
                    start = delAny(start, end);
                    break;
                case 9:
                    search(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
