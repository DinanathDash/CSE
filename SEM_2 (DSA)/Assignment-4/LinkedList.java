import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
}

public class LinkedList {
    public static Node create(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the regd_no and mark: ");
            int regd_no = sc.nextInt();
            float mark = sc.nextFloat();
            start = InsEnd(start, regd_no, mark);
        }
        return start;
    }

    public static Node InsBeg(Node start, int regd_no, float mark) {
        Node temp = new Node(regd_no, mark);
        temp.next = start;
        start = temp;
        return start;
    }

    public static Node InsEnd(Node start, int regd_no, float mark) {
        Node temp = new Node(regd_no, mark);
        if (start == null) {
            start = temp;
            return start;
        }
        Node p = start;
        while (p.next != null)
            p = p.next;
        p.next = temp;
        return start;
    }

    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position to insert: ");
        int pos = sc.nextInt();
        if (pos == 1) {
            System.out.println("Enter the regd_no and mark: ");
            int regd_no = sc.nextInt();
            float mark = sc.nextFloat();
            start = InsBeg(start, regd_no, mark);
            return start;
        }
        Node p = start;
        for (int i = 1; i < pos - 1 && p != null; i++)
            p = p.next;
        if (p == null)
            System.out.println("There are less than " + pos + " elements");
        else {
            System.out.println("Enter the regd_no and mark: ");
            int regd_no = sc.nextInt();
            float mark = sc.nextFloat();
            Node temp = new Node(regd_no, mark);
            temp.next = p.next;
            p.next = temp;
        }
        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty");
            return start;
        }
        start = start.next;
        return start;
    }

    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty");
            return start;
        }
        if (start.next == null) {
            start = null;
            return start;
        }
        Node p = start;
        while (p.next.next != null)
            p = p.next;
        p.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position to delete: ");
        int pos = sc.nextInt();
        if (pos == 1) {
            start = DelBeg(start);
            return start;
        }
        Node p = start;
        for (int i = 1; i < pos - 1 && p != null; i++)
            p = p.next;
        if (p == null || p.next == null)
            System.out.println("There are less than " + pos + " elements");
        else
            p.next = p.next.next;
        return start;
    }

    public static Node DelRegd(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regd_no to delete: ");
        int regd_no = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty");
            return start;
        }
        if (start.regd_no == regd_no) {
            start = DelBeg(start);
            return start;
        }
        Node p = start;
        while (p.next != null) {
            if (p.next.regd_no == regd_no) {
                p.next = p.next.next;
                return start;
            }
            p = p.next;
        }
        System.out.println("Regd_no not found");
        return start;
    }

    public static void search(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regd_no to search: ");
        int regd_no = sc.nextInt();
        Node p = start;
        while (p != null) {
            if (p.regd_no == regd_no) {
                System.out.println("Mark: " + p.mark);
                System.out.println("Enter the new mark: ");
                float mark = sc.nextFloat();
                p.mark = mark;
                return;
            }
            p = p.next;
        }
        System.out.println("Regd_no not found");
    }

    public static void sort(Node start) {
        Node p, q;
        for (p = start; p != null; p = p.next){
            for (q = p.next; q != null; q = q.next){
                if (p.mark < q.mark) {
                    float tempMark = p.mark;
                    int tempRegd = p.regd_no;
                    p.mark = q.mark;
                    q.mark = p.mark;
                    q.regd_no = tempRegd;
                }
            }
        } 
    }

    public static int count(Node start) {
        int count = 0;
        Node p = start;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public static Node reverse(Node start) {
        Node prev, ptr, next;
        prev = null;
        ptr = start;
        while (ptr != null) {
            next = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = next;
        }
        start = prev;
        return start;
    }

    public static void display(Node start) {
        Node p = start;
        while (p != null) {
            System.out.println("Regd_no: " + p.regd_no + " Mark: " + p.mark);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        int choice;
        while (true) {
            System.out.println("****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insert at beginning");
            System.out.println("4:Insert at end");
            System.out.println("5:Insert at any position");
            System.out.println("6:Delete from beginning");
            System.out.println("7:Delete from end");
            System.out.println("8:Delete from any position");
            System.out.println("9:Delete by regd_no");
            System.out.println("10:Search and update mark");
            System.out.println("11:Sort by mark");
            System.out.println("12:Count nodes");
            System.out.println("13:Reverse list");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    start = create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    System.out.println("Enter the regd_no and mark: ");
                    int regd_no = sc.nextInt();
                    float mark = sc.nextFloat();
                    start = InsBeg(start, regd_no, mark);
                    break;
                case 4:
                    System.out.println("Enter the regd_no and mark: ");
                    regd_no = sc.nextInt();
                    mark = sc.nextFloat();
                    start = InsEnd(start, regd_no, mark);
                    break;
                case 5:
                    start = InsAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    start = DelAny(start);
                    break;
                case 9:
                    start = DelRegd(start);
                    break;
                case 10:
                    search(start);
                    break;
                case 11:
                    sort(start);
                    break;
                case 12:
                    System.out.println("Number of nodes: " + count(start));
                    break;
                case 13:
                    start = reverse(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
