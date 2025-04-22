class LinkedList5 {
    Node head; 
    public LinkedList5() {
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
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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
public class Q5 {
    public static void main(String[] args) {
        LinkedList5 list = new LinkedList5();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        System.out.println("Original Linked List:");
        list.traverse();
        list.reverse();
        System.out.println("Reversed Linked List:");
        list.traverse();
    }
}
