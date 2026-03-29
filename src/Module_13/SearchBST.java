package Module_13;
class Node1{
    int data;
    Node left, right;

    Node1(int data) {
        this.data = data;
    }
}

public class SearchBST {

    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);

        System.out.println(search(root, 3));

    }
}