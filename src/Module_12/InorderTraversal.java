package Module_12;

class Node1{
    int data;
    Node left,right;
    Node1(int d){
        data=d;
        left=right=null;
    }
}
public class InorderTraversal {
    static void inorder(Node root) {
        if(root !=null){
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        inorder(root);
    }
}
