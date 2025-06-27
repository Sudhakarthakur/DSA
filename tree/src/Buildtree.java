
public class Buildtree {
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

     static class BinaryTree{
        static int idx =-1;

        public static Node builtTree(int arr[]){
            idx++;
            if(idx>=arr.length || arr[idx] == -1){
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = builtTree(arr);
            newNode.right = builtTree(arr);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(arr);
        System.out.println(root.data);
    }
}