class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q7a {
    public static void main(String[] args) {
        // Create a linked list
        Node head = new Node(87);
        head.next = new Node(23);
        head.next.next = new Node(34);
        head.next.next.next = new Node(66);

        // Create a new node with data 45
        Node newNode = new Node(45);

        // Find the node with data 23
        Node currentNode = head;
        while (currentNode.data != 23) {
            currentNode = currentNode.next;
        }

        // Insert the new node after the node with data 23
        newNode.next = currentNode.next;
        currentNode.next = newNode;

        // Print the linked list
        printLinkedList(head);
    }

    private static void printLinkedList(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}