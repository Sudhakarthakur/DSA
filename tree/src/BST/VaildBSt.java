package BST;

import java.util.LinkedList;
import java.util.Queue;

public class VaildBSt {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root , int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;
    }

    // iNORDER CODE
    public static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);

    }

    // code for BST valid or not
    public static boolean IsValid(Node root ,  Node max  ,Node min){
        if(root == null){
            return true;
        }

        if(max != null && max.data <= root.data){
            return false;
        }
        if(min != null && min.data >= root.data){
            return false;
        }
        return IsValid(root.left ,root,min) && IsValid(root.right , max, root);
    }



    public static void main(String[] args) {
        int[] nodes = {8,5,11,3,6,10,12};
        Node root = null;

        for(int i=0; i<nodes.length;i++){
            root = insert(root,nodes[i]);
        }
//        InOrder(root);
//        System.out.println();


//        if(IsVa lid(root , null ,null)){
//            System.out.println(" Valid BST");
//        }else {
//            System.out.println("InValid BST");
//        }

    }
}
