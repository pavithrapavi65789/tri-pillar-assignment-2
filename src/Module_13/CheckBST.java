package Module_13;
class Node4{
    int data;
    Node left, right;

    Node4(int data) {
        this.data = data;
    }
}

public class CheckBST {

    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);

        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
