package BST;

public class DeleteNode {
        static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data = data;
//            this.left = null;
//            this.right = null;
            }
        }

        // Write insert function to insert in binary search tree
        public static Node insert(Node root , int val){
            if(root == null){
                root = new Node(val);
                return root;
            }

            if(root.data > val){
                root.left = insert(root.left,val);
            }else {
                root.right = insert(root.right,val);
            }
            return root;
        }

        // inorder code
        public static void InOrder(Node root){
            if(root == null){
                return;
            }
            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);
        }

        // search key
        public  static boolean Search(Node root , int key){
            if(root == null){
                return false;
            }
            if(root.data == key){
                return true;
            }
            if(root.data > key){
                return  Search(root.left ,key);
            }
            else {
                return Search(root.right,key);
            }
        }


        public static void main(String[] args) {
            int Valuse[] = {5,1,3,4,2,7};
            Node root = null;

            for(int i=0;i<Valuse.length;i++){
                root= insert(root,Valuse[i]);
            }
            InOrder(root);
            System.out.println();

            if(Search(root ,33)){
                System.out.println("found data");
            }else {
                System.out.println("Not Found data");
            }
        }
    }

