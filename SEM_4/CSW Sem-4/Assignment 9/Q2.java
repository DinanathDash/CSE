class BSTNode {
    int info;
    BSTNode left, right;

    public BSTNode(int info) {
        this.info = info;
        this.left = this.right = null;
    }
}

class BinarySearchTree {
    BSTNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int info) {
        root = insertRec(root, info);
    }

    private BSTNode insertRec(BSTNode root, int info) {
        if (root == null) {
            root = new BSTNode(info);
            return root;
        }

        if (info < root.info)
            root.left = insertRec(root.left, info);
        else if (info > root.info)
            root.right = insertRec(root.right, info);

        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.info + " ");
            inorderRec(root.right);
        }
    }

    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(BSTNode root) {
        if (root != null) {
            System.out.print(root.info + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(BSTNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.info + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("Preorder traversal:");
        tree.preorder();

        System.out.println("Postorder traversal:");
        tree.postorder();
    }
}
