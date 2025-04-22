class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
public class Q1 {
    public static TreeNode sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedArrayToBST(arr, start, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, end);
        return root;
    }
    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = sortedArrayToBST(sortedArray, 0, sortedArray.length - 1);
        System.out.println("In-order traversal of the constructed binary tree:");
        inOrderTraversal(root);
    }
}
