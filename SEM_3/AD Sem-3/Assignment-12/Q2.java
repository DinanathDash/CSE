class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
public class Q2 {
    public static TreeNode findMinNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static TreeNode findMaxNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode minNode = findMinNode(root);
        System.out.println("Node with minimum value: " + minNode.data);

        TreeNode maxNode = findMaxNode(root);
        System.out.println("Node with maximum value: " + maxNode.data);
    }
}
