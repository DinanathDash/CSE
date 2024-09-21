class StringType {
    Node root = null;

    class Node {
        String value;
        int count;
        Node lChild, rChild;
    }

    public void print() {
        print(root);
    }

    public void print(Node curr) {
        if (curr != null) {
            System.out.print("Value is: " + curr.value);
            System.out.println("Count is: " + curr.count);
            print(curr.lChild);
            print(curr.rChild);
        }
    }

    public void add(String value) {
        root = add(value, root);
    }

    Node add(String value, Node curr) {
        int compare;
        if (curr == null) {
            curr = new Node();
            curr.value = value;
            curr.lChild = curr.rChild = null;
            curr.count = 1;
        } else {
            compare = curr.value.compareTo(value);
            if (compare == 0)
                curr.count++;
            else if (compare > 0)
                curr.lChild = add(value, curr.lChild);
            else
                curr.rChild = add(value, curr.rChild);
        }
        return curr;
    }

    boolean find(String value) {
        return find(root, value);
    }

    boolean find(Node curr, String value) {
        int compare;
        if (curr == null)
            return false;
        compare = curr.value.compareTo(value);
        if (compare == 0)
            return true;
        else {
            if (compare > 0)
                return find(curr.lChild, value);
            else
                return find(curr.rChild, value);
        }
    }

    int frequency(String value) {
        return frequency(root, value);
    }

    int frequency(Node curr, String value) {
        int compare;
        if (curr == null)
            return 0;
        compare = curr.value.compareTo(value);
        if (compare == 0)
            return curr.count;
        else {
            if (compare > 0)
                return frequency(curr.lChild, value);
            else
                return frequency(curr.rChild, value);
        }
    }

    void freeTree() {
        root = null;
    }
}

public class Q1 {
    public static void main(String[] args) {
        StringType stringType = new StringType();

        stringType.add("apple");
        stringType.add("banana");
        stringType.add("apple");
        stringType.add("orange");

        System.out.println("Checking if 'banana' exists: " + stringType.find("banana"));
        System.out.println("Checking if 'grape' exists: " + stringType.find("grape"));

        System.out.println("\nFrequency of 'apple': " + stringType.frequency("apple"));
        System.out.println("Frequency of 'banana': " + stringType.frequency("banana"));
        System.out.println("Frequency of 'grape': " + stringType.frequency("grape"));

        stringType.freeTree();
    }
}
