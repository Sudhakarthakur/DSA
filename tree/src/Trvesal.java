import java.util.LinkedList;
import java.util.Queue;

public class Trvesal {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node builtTree(int arr[]) {
            idx++;
            if (idx >= arr.length || arr[idx] == -1) {
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = builtTree(arr);
            newNode.right = builtTree(arr);
            return newNode;

        }
    }

        // preOrder travasal
        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // inOrder
    public static void Inorder(Node head){
        if(head == null){
            return;
        }
        Inorder(head.left);
        System.out.print(head.data+" ");
        Inorder(head.right);
    }

    // postOrder
    public static void PostOrder(Node root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }

    // lever order travesal
    public  static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

    }



    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(arr);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        Inorder(root);
//        System.out.println();
//        PostOrder(root);
        System.out.println();

        LevelOrder(root);
    }
}
