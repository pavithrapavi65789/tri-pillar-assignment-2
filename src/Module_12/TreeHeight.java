package Module_12;
class Node4{
    int data;
    Node left, right;

    Node4(int data) {
        this.data = data;
    }
}

public class TreeHeight {

    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Height: " + height(root));
    }
}
