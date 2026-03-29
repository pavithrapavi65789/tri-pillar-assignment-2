package Module_13;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class InsertBST {

    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 7);

        inorder(root);
    }
}
