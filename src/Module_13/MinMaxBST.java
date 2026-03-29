package Module_13;
class Node2{
    int data;
    Node left, right;

    Node2(int data) {
        this.data = data;
    }
}

public class MinMaxBST {

    static int min(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    static int max(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);

        System.out.println("Min: " + min(root));
        System.out.println("Max: " + max(root));
    }
}
