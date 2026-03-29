package Module_12;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PostorderTraversal {

    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        postorder(root);
    }
}
