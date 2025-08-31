
class Node {

    char key;
    Node left;
    Node right;

    public Node(char item) {
        key = item;
        left = null;
        right = null;
    }
}

class BinaryTree {

    Node root;

    public void preOrderTransversal(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrderTransversal(node.left);
            preOrderTransversal(node.right);
        }
    }

    public void InOrderTransversal(Node node) {
        if (node != null) {
            InOrderTransversal(node.left);
            System.out.print(node.key + " ");
            InOrderTransversal(node.right);
        }
    }

    public void PostOrderTransversal(Node node) {
        if (node != null) {
            PostOrderTransversal(node.right);
            PostOrderTransversal(node.left);
            System.out.print(node.key + " ");
        }
    }
    Node r2 = new Node (1);
    r2.left = new Node(2);
    
}






















public static void main(String[] args) {
    April23 treeExample = new April23();
    BinaryTree tree = treeExample.new BinaryTree();

    tree.root = treeExample.new Node('1');
    tree.root.left = treeExample.new Node('2');
    tree.root.right = treeExample.new Node('3');
    tree.root.left.left = treeExample.new Node('4');
    tree.root.left.right = treeExample.new Node('5');

    System.out.print("Preorder Transversal: ");
    tree.preOrderTransversal(tree.root);
    System.out.println("");
    System.out.print("Inorder Transversal: ");
    tree.InOrderTransversal(tree.root);
    System.out.println("");
    System.out.print("Postorder Transversal: ");
    tree.PostOrderTransversal(tree.root);
    System.out.println("");
}
