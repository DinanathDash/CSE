class LinkedList4 {
    Node head;
    public LinkedList4() {
        this.head = null;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    public void traverse() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Q4 {
    public static void main(String[] args) {
        LinkedList4 list = new LinkedList4();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.traverse();
    }
}
