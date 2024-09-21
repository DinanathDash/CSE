import java.util.LinkedList;
import java.util.Queue;

class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + "}";
    }
}

class BNode {
    Country info;
    BNode left, right;

    public BNode(Country info) {
        this.info = info;
        this.left = this.right = null;
    }
}

class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Country info) {
        root = insertRec(root, info);
    }

    private BNode insertRec(BNode root, Country info) {
        if (root == null) {
            root = new BNode(info);
            return root;
        }

        if (info.getPopulation() < root.info.getPopulation())
            root.left = insertRec(root.left, info);
        else if (info.getPopulation() > root.info.getPopulation())
            root.right = insertRec(root.right, info);

        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.info + " ");
            inorderRec(root.right);
        }
    }

    public void levelOrder() {
        if (root == null) return;

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BNode currentNode = queue.poll();
            System.out.print(currentNode.info + " ");

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        System.out.println();
    }

    public Country findMax() {
        return findMaxRec(root);
    }

    private Country findMaxRec(BNode root) {
        if (root == null) return null;
        while (root.right != null) {
            root = root.right;
        }
        return root.info;
    }

    public Country findMin() {
        return findMinRec(root);
    }

    private Country findMinRec(BNode root) {
        if (root == null) return null;
        while (root.left != null) {
            root = root.left;
        }
        return root.info;
    }

    public static void main(String[] args) {
        BST tree = new BST();

        Country usa = new Country("USA", 331002651);
        Country canada = new Country("Canada", 37742154);
        Country mexico = new Country("Mexico", 128932753);
        Country japan = new Country("Japan", 126476461);
        Country india = new Country("India", 1380004385);

        tree.insert(usa);
        tree.insert(canada);
        tree.insert(mexico);
        tree.insert(japan);
        tree.insert(india);

        System.out.println("Inorder traversal of the BST:");
        tree.inorder();

        System.out.println("Level order traversal of the BST:");
        tree.levelOrder();

        Country maxCountry = tree.findMax();
        System.out.println("Country with maximum population: " + maxCountry);

        Country minCountry = tree.findMin();
        System.out.println("Country with minimum population: " + minCountry);
    }
}
