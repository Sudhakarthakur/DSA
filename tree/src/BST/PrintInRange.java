package BST;

import java.util.ArrayList;

public class PrintInRange {
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

        // Print all Nodes in Allie in Given Range;
        public static void PrintTnrange(Node root, int k1, int k2){
            if(root.data>=k1 && root.data<=k2){
                PrintTnrange(root.left ,k1,k2);
                System.out.println(root.data+" ");
                PrintTnrange(root.left,k1,k2);
            }
            else if(root.data < k1){
                PrintTnrange(root.left ,k1,k2);
            }else {
                PrintTnrange(root.right,k1,k2);
            }
        }

    // Root to leaf Node
    public static void PrintPath(Node root , ArrayList<Integer> path){
            if(root == null){
                return;
            }
            path.add(root.data);
            if(root.left == null && root.right == null){
                printPath1(path);
            }
            PrintPath(root.left,path);
            PrintPath(root.right,path);
            path.remove(path.size()-1);
    }

    public static void printPath1(ArrayList<Integer> path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+"->");
            }
        System.out.println("Null");
    }


        public static void main(String[] args) {
            int Valuse[] = {8,5,1,4,6,10,11,14};
            Node root = null;

            for(int i=0;i<Valuse.length;i++){
                root= insert(root,Valuse[i]);
            }
            InOrder(root);
            System.out.println();

            PrintPath(root ,new ArrayList<>());
        }
    }


