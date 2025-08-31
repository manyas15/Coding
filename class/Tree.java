public class Tree {

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    Tree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inorderTraversal() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        // Insert values into the binary tree
        int[] values = {80, 60, 90, 10, 70, 85, 110};
        for (int value : values) {
            tree.insert(value);
        }

        // Perform inorder traversal
        System.out.println("Inorder traversal of the binary tree:");
        tree.inorderTraversal();
        System.out.println("Preorder traversal: ");
        tree.
    }
}