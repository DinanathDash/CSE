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

    public void delete(int population) {
        root = deleteRec(root, population);
    }

    private BNode deleteRec(BNode root, int population) {
        if (root == null) return root;

        if (population < root.info.getPopulation())
            root.left = deleteRec(root.left, population);
        else if (population > root.info.getPopulation())
            root.right = deleteRec(root.right, population);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.info = minValue(root.right);

            root.right = deleteRec(root.right, root.info.getPopulation());
        }

        return root;
    }

    private Country minValue(BNode root) {
        Country minv = root.info;
        while (root.left != null) {
            root = root.left;
            minv = root.info;
        }
        return minv;
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

        System.out.println("Deleting node with population 128932753 (Mexico):");
        tree.delete(128932753);
        tree.inorder();

        System.out.println("Deleting node with population 37742154 (Canada):");
        tree.delete(37742154);
        tree.inorder();

        System.out.println("Deleting node with population 331002651 (USA):");
        tree.delete(331002651);
        tree.inorder();
    }
}
