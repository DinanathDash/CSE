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

    public void createTree(int[] arr) {
        root = createTreeRec(arr, 0, arr.length - 1);
    }

    private BNode createTreeRec(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        BNode node = new BNode(new Country("Country" + arr[mid], arr[mid]));

        node.left = createTreeRec(arr, start, mid - 1);

        node.right = createTreeRec(arr, mid + 1, end);

        return node;
    }

    public static void main(String[] args) {
        BST tree = new BST();

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        tree.createTree(arr);

        System.out.println("Inorder traversal of the BST:");
        tree.inorder();
    }
}
