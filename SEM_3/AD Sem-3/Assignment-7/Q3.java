class LinkedList3 {
    Node head;
    public LinkedList3() {
        this.head = null;
    }
    public void deleteNode(int key) {
        Node current = head;
        Node prev = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node with value " + key + " not found.");
            return;
        }
        prev.next = current.next;
    }
    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Q3 {
    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        list.printList();
        list.deleteNode(2);
        list.printList();
    }
}
