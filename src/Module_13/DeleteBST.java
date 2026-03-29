package Module_13;
class Node3 {
    int data;
    Node left, right;

    Node3(int data) {
        this.data = data;
    }
}

public class DeleteBST {

    static int min(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.data = min(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);

        root = delete(root, 3);
        System.out.println("Deleted 3");
    }
}
