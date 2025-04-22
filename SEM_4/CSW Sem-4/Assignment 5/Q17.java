class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;
    TreeNode[] elements;

    public BinarySearchTree(int capacity) {
        elements = new TreeNode[capacity];
    }

    public void insert(int data, int index) {
        TreeNode newNode = new TreeNode(data);
        elements[index] = newNode;
    }

    public int getElementAtIndex(int index) {
        try {
            return elements[index].data;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds");
            return -1;
        }
    }
}

public class Q17 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(5);

        tree.insert(3, 0);
        tree.insert(5, 1);
        tree.insert(2, 2);
        tree.insert(4, 3);
        tree.insert(6, 4);

        int index = 10;
        int element = tree.getElementAtIndex(index);
        System.out.println("Element at index " + index + ": " + element);
    }
}
