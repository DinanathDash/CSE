import java.util.*;

class Node implements Comparable<Node> {
    char ch;
    int weight;
    Node left, right;

    public Node(char ch, int weight) {
        this.ch = ch;
        this.weight = weight;
        this.left = null;
        this.right = null;
    }

    public Node(Node left, Node right) {
        this.ch = '\0'; 
        this.weight = left.weight + right.weight;
        this.left = left;
        this.right = right;
    }

    public int compareTo(Node other) {
        return this.weight - other.weight;
    }
}

public class Q3 {
    public static Node buildHuffmanTree(char[] ch, int[] weights) {
        int n = ch.length;
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(new Node(ch[i], weights[i]));
        }

        for (int i = 0; i < n - 1; i++) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node node = new Node(left, right);
            pq.add(node);
        }

        return pq.poll();
    }

    public static void printHuffmanCodes(Node root, String str) {
        if (root == null)
            return;

        if (root.left == null && root.right == null && Character.isDefined(root.ch)) {
            System.out.println(root.ch + ":" + str);
            return;
        }

        printHuffmanCodes(root.left, str + "0");
        printHuffmanCodes(root.right, str + "1");
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        int[] weights = {30, 25, 21, 14, 10};

        Node root = buildHuffmanTree(ch, weights);

        System.out.println("Huffman Codes are:");
        printHuffmanCodes(root, "");
    }
}
